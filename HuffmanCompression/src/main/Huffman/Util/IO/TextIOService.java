package main.Huffman.Util.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TextIOService implements IOService {
    @Override
    public String read(String filename) {
        try (FileInputStream f = new FileInputStream(filename)) {
            Scanner scanner = new Scanner(f);
            StringBuilder text = new StringBuilder();
            while (scanner.hasNext()) {
                text.append(scanner.next());
            }
            return text.toString();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        } catch (IOException e) {
            System.out.println("Error reading file: " + filename);
        }
        return "";
    }

    @Override
    public void write(String source, String content) {

    }
}
