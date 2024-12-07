package main.Huffman.Util.IO;

import java.io.FileOutputStream;
import java.util.Map;

public class MapIOService {
    public String read(String sourceFilename) {
        return "";
    }

    public void write(String destinationFilename, Map<String, String> huffmanMap, int offset) {
        try (FileOutputStream f = new FileOutputStream(destinationFilename)) {
            f.write(String.valueOf(offset).getBytes());
            f.write("\n".getBytes());
            for (Map.Entry<String, String> entry : huffmanMap.entrySet()) {
                f.write(entry.getKey().getBytes());
                f.write(" ".getBytes());
                f.write(entry.getValue().getBytes());
                f.write("\n".getBytes());
            }
        } catch (Exception e) {
            System.out.println("Error writing map to file: " + destinationFilename);
            System.out.println(e.getMessage());
        }
    }
}
