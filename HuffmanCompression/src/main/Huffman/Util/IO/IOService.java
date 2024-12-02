package main.Huffman.Util.IO;

public interface IOService {
    String read(String filename);

    public void write(String source, String content);
}
