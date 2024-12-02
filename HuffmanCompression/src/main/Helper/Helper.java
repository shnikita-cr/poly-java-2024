package main.Helper;

public class Helper {
    public static void printHelpInfo() {
        System.out.println("Usage:");
        System.out.println("-d_ file.ext -> decompress");
        System.out.println("-c_ file.ext -> compress");
        System.out.println("file types:");
        System.out.println("          _t -> text");
        System.out.println("          _b -> binary");
        System.out.println("Example: HuffmanCompression -cb file.txt == compress binary");
        System.out.println("Example: HuffmanCompression -dt file.txt == decompress text");

    }
}
