package main.Huffman.Util.IO;

import java.io.FileOutputStream;

public interface IOService {
    String read(String sourceFilename);

    default int write(String destinationFilename, String binaryString) {
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
