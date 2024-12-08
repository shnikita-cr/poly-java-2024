package main.Huffman.Util.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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

    @Override
    public int write(String destinationFilename, String textString) {
        try (FileOutputStream f = new FileOutputStream(destinationFilename)) {
            f.write(textString.getBytes());
        } catch (Exception e) {
            System.out.println("Error writing data to file: " + destinationFilename);
            System.out.println(e.getMessage());
        }
        return 0;
    }
}