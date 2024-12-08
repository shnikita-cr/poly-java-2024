package main.Huffman.Util.IO;

public interface IOService {
    String read(String sourceFilename);

    int write(String destinationFilename, String binaryString);
}
