package main.Huffman;

import main.Huffman.Util.Dictionary;
import main.Huffman.Util.Node;

import java.util.*;

public class HuffmanProcessor {
    private static void encode(Node root, String str, Map<String, String> huffmanMap) {
        if (root == null) return;

        // found a leaf node
        if (root.isLeaf()) {
            huffmanMap.put(String.valueOf(root.getCh()), str);
        }

        encode(root.getLeft(), str + "0", huffmanMap);
        encode(root.getRight(), str + "1", huffmanMap);
    }

    private static Node buildHuffmanTree(List<String> stringList) {
        Map<String, Integer> freq = new HashMap<>();
        for (String string : stringList) {
            if (!freq.containsKey(string)) {
                freq.put(string, 0);
            }
            freq.put(string, freq.get(string) + 1);
        }
        PriorityQueue<Node> pq = new PriorityQueue<>((l, r) -> l.getFreq() - r.getFreq());
        for (Map.Entry<String, Integer> entry : freq.entrySet()) {
            pq.add(new Node(entry.getKey(), entry.getValue()));
        }
        while (pq.size() != 1) {
            Node left = pq.poll();
            Node right = pq.poll();
            int sum = Objects.requireNonNull(left).getFreq() + Objects.requireNonNull(right).getFreq();
            pq.add(new Node("\0", sum, left, right));
        }
        return pq.peek();
    }

    public static Map<String, String> buildMap(List<String> content) {
        Node huffmanTree = buildHuffmanTree(content);
        String startSymbol = "";
        if (huffmanTree.isLeaf()) {
            startSymbol = "0";
        }
        Map<String, String> huffmanMap = new HashMap<>();
        encode(huffmanTree, startSymbol, huffmanMap);
        return huffmanMap;
    }

    public static String compress(List<String> text, Map<String, String> huffmanMap) {
        StringBuilder sb = new StringBuilder();
        for (String string : text) {
            sb.append(huffmanMap.get(String.valueOf(string)));
        }
        return sb.toString();
    }

    public static String decompress(String string, Dictionary dictionary) {
        StringBuilder result = new StringBuilder();
        StringBuilder currentSymbol = new StringBuilder();
        for (int i = 0; i < string.length() - dictionary.offset(); i++) {
            currentSymbol.append(string.charAt(i));
            if (dictionary.map().containsKey(currentSymbol.toString())) {
                result.append(dictionary.map().get(currentSymbol.toString()));
                currentSymbol.setLength(0); //очистка текущей строчки
            }
        }
        return result.toString();
    }
}