package main.Huffman.Util.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TextIOService implements IOService {
    @Override
    public String read(String sourceFilename) {
        try (FileInputStream f = new FileInputStream(sourceFilename)) {
            Scanner scanner = new Scanner(f);
            StringBuilder text = new StringBuilder();
            while (scanner.hasNext()) {
                text.append(scanner.nextLine());
            }
            scanner.close();
            return text.toString();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + sourceFilename);
        } catch (IOException e) {
            System.out.println("Error reading file: " + sourceFilename);
        }
        return "";
    }
}