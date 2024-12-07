package main.Huffman;

import main.Huffman.Util.IO.IOService;
import main.Huffman.Util.IO.MapIOService;

import java.util.Map;

public class Huffman {
    public static void compress(String filename, IOService ioService) {
        String originalString = ioService.read(filename);
        System.out.println("originalString   " + originalString);
        Map<String, String> huffmanMap = HuffmanProcessor.buildMap(originalString);
        System.out.println("huffmanMap " + huffmanMap);
        String compressedString = HuffmanProcessor.compress(originalString, huffmanMap);
        System.out.println("compressedString " + compressedString);
        int offset = ioService.write(filename + "b", compressedString);
        System.out.println("offset " + offset);
        MapIOService mapIOService = new MapIOService();
        mapIOService.write(filename + "m", huffmanMap, offset);
    }

    public static void decompress(String filename, IOService ioService) {
        String originalString = ioService.read(filename);
        System.out.println("originalString   " + originalString);
    }
}
