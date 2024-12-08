package main.Huffman.Util;

import java.util.Map;

public record Dictionary(int offset, Map<String, String> map) {

    @Override
    public String toString() {
        return "Dictionary{" +
                "offset=" + offset +
                ", map=" + map +
                '}';
    }
}
