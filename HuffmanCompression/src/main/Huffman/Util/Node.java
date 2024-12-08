package main.Huffman.Util;

public class Node {
    private final String ch;
    private final int freq;
    private Node left = null, right = null;

    public Node(String ch, int freq) {
        this.ch = ch;
        this.freq = freq;
    }

    public Node(String ch, int freq, Node left, Node right) {
        this.ch = ch;
        this.freq = freq;
        this.left = left;
        this.right = right;
    }

    public boolean isLeaf() {
        return left == null && right == null;
    }

    public String getCh() {
        return ch;
    }

    public int getFreq() {
        return freq;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }
}