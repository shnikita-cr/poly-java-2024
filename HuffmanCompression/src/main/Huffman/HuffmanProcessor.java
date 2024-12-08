package main.Huffman;

import main.Huffman.Util.Dictionary;
import main.Huffman.Util.Node;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

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

    private static Node buildHuffmanTree(String text) {
        // count frequency of appearance of each character
        // and store it in a map
        Map<Character, Integer> freq = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            if (!freq.containsKey(text.charAt(i))) {
                freq.put(text.charAt(i), 0);
            }
            freq.put(text.charAt(i), freq.get(text.charAt(i)) + 1);
        }

        // Create a priority queue to store live nodes of Huffman tree
        // Notice that highest priority item has lowest frequency
        PriorityQueue<Node> pq = new PriorityQueue<>((l, r) -> l.getFreq() - r.getFreq());

        // Create a leaf node for each character and add it
        // to the priority queue.
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            pq.add(new Node(entry.getKey(), entry.getValue()));
        }

        // do till there is more than one node in the queue
        while (pq.size() != 1) {
            // Remove the two nodes of highest priority
            // (lowest frequency) from the queue
            Node left = pq.poll();
            Node right = pq.poll();

            // Create a new internal node with these two nodes as children
            // and with frequency equal to the sum of the two nodes
            // frequencies. Add the new node to the priority queue.
            int sum = left.getFreq() + right.getFreq();
            pq.add(new Node('\0', sum, left, right));
        }

        // root stores pointer to root of Huffman Tree
        Node root = pq.peek();
        return root;
    }

    public static Map<String, String> buildMap(String content) {
        Node huffmanTree = buildHuffmanTree(content);
        String startSymbol = "";
        if (huffmanTree.isLeaf()) {
            startSymbol = "0";
        }
        Map<String, String> huffmanMap = new HashMap<>();
        encode(huffmanTree, startSymbol, huffmanMap);
        return huffmanMap;
    }

    public static String compress(String text, Map<String, String> huffmanMap) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            sb.append(huffmanMap.get(String.valueOf(text.charAt(i))));
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