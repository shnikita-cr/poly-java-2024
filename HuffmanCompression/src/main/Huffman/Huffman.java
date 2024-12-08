package main.Huffman;

import main.Huffman.Util.Dictionary;
import main.Huffman.Util.IO.DictionaryIOService;
import main.Huffman.Util.IO.IOService;

import java.util.Map;

public class Huffman {
    public static void compress(String filename, IOService readIOService, IOService writeIOService) {
        String originalString = readIOService.read(filename);
        System.out.println("originalString   " + originalString);

        Map<String, String> huffmanMap = HuffmanProcessor.buildMap(originalString);
        System.out.println("huffmanMap " + huffmanMap);

        String compressedString = HuffmanProcessor.compress(originalString, huffmanMap);
        System.out.println("compressedString " + compressedString);

        int offset = writeIOService.write(filename + "b", compressedString);
        System.out.println("offset " + offset);

        DictionaryIOService dictionaryIOService = new DictionaryIOService();
        dictionaryIOService.write(filename + "m", new Dictionary(offset, huffmanMap));
        System.out.println("huffmanMap " + huffmanMap);
    }

    public static void decompress(String filename, IOService readIOService, IOService writeIOService) {
        String compressedString = readIOService.read(filename + "b");
        System.out.println("compressedString   " + compressedString);

        DictionaryIOService dictionaryIOService = new DictionaryIOService();
        Dictionary dictionary = dictionaryIOService.read(filename + "m");
        System.out.println("dictionary " + dictionary);

        String originalString = HuffmanProcessor.decompress(compressedString, dictionary);
        System.out.println("originalString   " + originalString);

        writeIOService.write(filename+"o", originalString);
    }
}
