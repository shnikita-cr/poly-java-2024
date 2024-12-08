package main.Huffman.Util.IO;

import java.util.List;

public interface IOService {
    String readString(String sourceFilename);

    List<String> readList(String sourceFilename);

    int write(String destinationFilename, String binaryString);
}