package main.Huffman.Util.IO;

import main.Huffman.Util.Dictionary;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryIOService {
    public Dictionary read(String sourceFilename) {
        Map<String, String> huffmanMap = new HashMap<>();
        int offset = 0;
        try (FileInputStream f = new FileInputStream(sourceFilename)) {
            Scanner scanner = new Scanner(f);
            offset = scanner.nextInt();
            scanner.nextLine();
            while (scanner.hasNextLine()) {
                //чтение в обратном порядке КОД - СИМВОЛ
                String line = scanner.nextLine();
                String[] words = line.split(" ");
                huffmanMap.put(words[1], words[0]);
            }
        } catch (Exception e) {
            System.out.println("Error reading dictionary from file: " + sourceFilename);
            System.out.println(e.getMessage());
        }

        return new Dictionary(offset, huffmanMap);
    }

    public void write(String destinationFilename, Dictionary dictionary) {
        try (FileOutputStream f = new FileOutputStream(destinationFilename)) {
            f.write(String.valueOf(dictionary.offset()).getBytes());
            f.write("\n".getBytes());
            for (Map.Entry<String, String> entry : dictionary.map().entrySet()) {
                f.write(entry.getKey().getBytes());
                f.write(" ".getBytes());
                f.write(entry.getValue().getBytes());
                f.write("\n".getBytes());
            }
        } catch (Exception e) {
            System.out.println("Error writing dictionary to file: " + destinationFilename);
            System.out.println(e.getMessage());
        }
    }
}
