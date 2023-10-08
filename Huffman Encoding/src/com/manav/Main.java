package com.manav;

public class Main {
    public static void main(String[] args) {
        String text = "My name is Manav";
        int[] charFrequencies = new int[256];

        for(char c : text.toCharArray()){
            ++charFrequencies[c];
        }

        HuffmanCode code = new HuffmanCode();
        HuffmanTree huffmanTree = code.buildTree(charFrequencies);
        code.printCodes(huffmanTree, new StringBuilder());
    }
}