package main.Huffman.Util.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BinaryIOService implements IOService {
    @Override
    public String readString(String sourceFilename) {
        StringBuilder result = new StringBuilder();
        // Читаем файл побайтно
        try (FileInputStream f = new FileInputStream(sourceFilename)) {
            int byteRead;
            while ((byteRead = f.read()) != -1) {
                // Конвертируем каждый байт в строку из 8 бит
                String binaryByte = String.format("%8s", Integer.toBinaryString(byteRead & 0xFF)).replace(' ', '0');
                result.append(binaryByte);
            }
            return result.toString();
        } catch (IOException e) {
            System.out.println("Error reading file: " + sourceFilename);
            System.out.println(e.getMessage());
            System.exit(1);
            return null;
        }
    }

    @Override
    public List<String> readList(String sourceFilename) {
        List<String> result = new ArrayList<>();
        // Читаем файл побайтно
        try (FileInputStream f = new FileInputStream(sourceFilename)) {
            int byteRead;
            while ((byteRead = f.read()) != -1) {
                // Конвертируем каждый байт в строку из 8 бит
                String binaryByte = String.format("%8s", Integer.toBinaryString(byteRead & 0xFF)).replace(' ', '0');
                result.add(binaryByte);
            }
            return result;
        } catch (IOException e) {
            System.out.println("Error reading file: " + sourceFilename);
            System.out.println(e.getMessage());
            System.exit(1);
            return null;
        }
    }

    @Override
    public int write(String destinationFilename, String binaryString) {
        if (!binaryString.matches("[01]+")) {
            throw new IllegalArgumentException("Строка должна содержать только символы '0' и '1'.");
        }

        int paddedLength = (binaryString.length() + 7) / 8 * 8;
        StringBuilder paddedBinaryString = new StringBuilder(binaryString);
        while (paddedBinaryString.length() < paddedLength) {
            paddedBinaryString.append('0');
        }

        byte[] binaryData = new byte[paddedBinaryString.length() / 8];
        for (int i = 0; i < paddedBinaryString.length(); i++) {
            int byteIndex = i / 8;
            int bitIndex = 7 - (i % 8);
            if (paddedBinaryString.charAt(i) == '1') {
                binaryData[byteIndex] |= (byte) (1 << bitIndex);
            }
        }

        try (FileOutputStream f = new FileOutputStream(destinationFilename)) {
            f.write(binaryData);
        } catch (Exception e) {
            System.out.println("Error writing data to file: " + destinationFilename);
            System.out.println(e.getMessage());
        }
        return paddedLength - binaryString.length();
    }
}