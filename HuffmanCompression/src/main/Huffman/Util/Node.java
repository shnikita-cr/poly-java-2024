package main.Huffman.Util;

public class Node {
    private char ch;
    private int freq;
    private Node left = null, right = null;

    public Node(char ch, int freq) {
        this.ch = ch;
        this.freq = freq;
    }

    public Node(char ch, int freq, Node left, Node right) {
        this.ch = ch;
        this.freq = freq;
        this.left = left;
        this.right = right;
    }

    public char getCh() {
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