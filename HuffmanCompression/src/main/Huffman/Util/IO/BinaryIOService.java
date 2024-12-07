package main.Huffman.Util.IO;

import java.io.FileInputStream;
import java.io.IOException;

public class BinaryIOService implements IOService {
    @Override
    public String read(String sourceFilename) {
        StringBuilder binaryString = new StringBuilder();

        // Читаем файл побайтно
        try (FileInputStream f = new FileInputStream(sourceFilename)) {
            int byteRead;
            while ((byteRead = f.read()) != -1) {
                // Конвертируем каждый байт в строку из 8 бит
                String binaryByte = String.format("%8s", Integer.toBinaryString(byteRead & 0xFF)).replace(' ', '0');
                binaryString.append(binaryByte);
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return binaryString.toString();
    }
}