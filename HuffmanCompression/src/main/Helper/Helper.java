package main.Helper;

public class Helper {
    public static void printHelpInfo() {
        System.out.println("Usage:");
        System.out.println("-d file.ext -> decompress");
        System.out.println("-c file.ext -> compress");
        System.out.println("Example: HuffmanCompression -c file.txt == compress ");
        System.out.println("Example: HuffmanCompression -d file.txt == decompress");
    }
}
