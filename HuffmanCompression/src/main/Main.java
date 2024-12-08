package main;

import main.Helper.Helper;
import main.Huffman.Huffman;
import main.Huffman.Util.IO.BinaryIOService;
import main.Huffman.Util.IO.TextIOService;

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
            System.out.println("Error: " + e.getMessage());
            System.out.println("Wrong usage!");
            Helper.printHelpInfo();
        }
    }

    static void compress(char mode, String filename) {
        switch (mode) {
            case 'b':
                BinaryIOService binaryIOService1 = new BinaryIOService();
                Huffman.compress(filename, binaryIOService1, binaryIOService1);
                break;
            case 't':
                TextIOService textIOService2 = new TextIOService();
                BinaryIOService binaryIOService2 = new BinaryIOService();
                Huffman.compress(filename, textIOService2, binaryIOService2);
                break;
            default:
                Helper.printHelpInfo();
        }
    }

    static void decompress(char mode, String filename) {
        switch (mode) {
            case 'b':
                BinaryIOService binaryIOService1 = new BinaryIOService();
                System.out.println("decompressing b" + filename);
                Huffman.decompress(filename, binaryIOService1, binaryIOService1);
                break;
            case 't':
                TextIOService textIOService2 = new TextIOService();
                BinaryIOService binaryIOService2 = new BinaryIOService();
                Huffman.decompress(filename, binaryIOService2, textIOService2);
                break;
            default:
                Helper.printHelpInfo();
        }
    }
}