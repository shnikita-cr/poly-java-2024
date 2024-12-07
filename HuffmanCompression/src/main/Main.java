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
            System.out.println("Wrong usage!");
            Helper.printHelpInfo();
        }
    }

    static void compress(char mode, String filename) {
        switch (mode) {
            case 'b':
                Huffman.compress(filename, new BinaryIOService());
                break;
            case 't':
                Huffman.compress(filename, new TextIOService());
                break;
            default:
                Helper.printHelpInfo();
        }
    }

    static void decompress(char mode, String filename) {
        switch (mode) {
            case 'b':
                System.out.println("decompressing b" + filename);
                break;
            case 't':
                Huffman.decompress(filename, new TextIOService());
                break;
            default:
                Helper.printHelpInfo();
        }
    }
}