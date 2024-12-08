package main;

import main.Helper.Helper;
import main.Huffman.Huffman;
import main.Huffman.Util.IO.BinaryIOService;

public class Main {
    public static void main(String[] args) {
        try {
            if (args[0].startsWith("-c")) {
                compress(args[1]);
            } else if (args[0].startsWith("-d")) {
                decompress(args[1]);
            } else {
                Helper.printHelpInfo();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Wrong usage!");
            Helper.printHelpInfo();
        }
    }

    static void compress(String filename) {
        Huffman.compress(filename, new BinaryIOService());
    }

    static void decompress(String filename) {
        Huffman.decompress(filename, new BinaryIOService());
    }
}