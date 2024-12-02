package main;

import main.Helper.Helper;
import main.Huffman.HuffmanProcessor;
import main.Huffman.Util.IO.BinaryIOService;
import main.Huffman.Util.IO.IOService;
import main.Huffman.Util.IO.TextIOService;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            if (args[0].startsWith("-c")) {
                compress(args[0].charAt(2), args[1]);
            } else if (args[0].startsWith("-d")) {
                decompress(args[0].charAt(2), args[1]);
            } else {
                Helper.printHelpInfo();
            }
        } catch (Exception e) {
            System.out.println("Wrong usage!");
            Helper.printHelpInfo();
        }
    }

    static void compress(char mode, String filename) {
        switch (mode) {
            case 'b':
                IOService binaryIOService = new BinaryIOService();
                String originalBinaryString = binaryIOService.read(filename);
                Map<String, String> huffmanBinaryMap = HuffmanProcessor.buildMap(originalBinaryString);
                String compressedBinaryString = HuffmanProcessor.compress(originalBinaryString, huffmanBinaryMap);
                binaryIOService.write(filename, compressedBinaryString);
                break;
            case 't':
                IOService textIOService = new TextIOService();
                String originalTextString = textIOService.read(filename);
                System.out.println(originalTextString);
                Map<String, String> huffmanTextMap = HuffmanProcessor.buildMap(originalTextString);
                String compressedTextString = HuffmanProcessor.compress(originalTextString, huffmanTextMap);
                System.out.println(compressedTextString);
                textIOService.write(filename, compressedTextString);
                break;
            default:
                Helper.printHelpInfo();
        }
    }

    static void decompress(char mode, String filename) {
//        switch (mode) {
//            case 'b':
//                IOService  binaryIOService = new BinaryIOService();
//                String originalBinaryString = binaryIOService.read(filename);
//                System.out.println(originalBinaryString);
//                Map<String, String> huffmanBinaryMap = Map.read(filename);
//                String decompressedBinaryString = HuffmanProcessor.decompress(originalBinaryString, huffmanBinaryMap);
//                StringToBinaryWriter.write(decompressedBinaryString);
//                break;
//            case 't':
//                String originalTextString = TextToStringReader.read(filename);
//                System.out.println(originalTextString);
//                Map<String, String> huffmanTextMap = MapReader.read(filename);
//                String decompressedTextString = HuffmanProcessor.decompress(originalTextString, huffmanTextMap);
//                StringToBinaryWriter.write(decompressedTextString);
//                break;
//            default:
//                Helper.printHelpInfo();
//        }
    }
}