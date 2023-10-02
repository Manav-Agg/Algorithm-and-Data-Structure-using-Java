package com.manav;

import java.util.ArrayList;
import java.util.List;

public class Tree{
    private Node root;
    private int indexOfSingleChild;

    public Tree(){
        this.root = new Node("");
    }

    public void insert(String key){
        Node tempNode = root;

        for(int i = 0; i < key.length(); i++){
            char c = key.charAt(i);
            int asciiIndex = c - 'a';

            if(tempNode.getChild(asciiIndex) == null){
                Node node = new Node(String.valueOf(c));
                tempNode.setChild(asciiIndex, node);
                tempNode = node;
            }
            else{
                tempNode = tempNode.getChild(asciiIndex);
            }
        }

        tempNode.setLeaf(true);
    }

//    0(length(key))
    public boolean search(String key){
        Node treeNode = root;

        for(int i = 0; i < key.length(); i++){
            char c = key.charAt(i);
            int asciiIndex = c - 'a';

            if(treeNode.getChild(asciiIndex) == null){
                return false;
            }
            else{
                treeNode = treeNode.getChild(asciiIndex);
            }
        }

        return true;
    }

    public List<String> allWordsWithPrefix(String prefix){
        Node treeNode = root;
        List<String> allWords = new ArrayList<>();

        for(int i = 0; i < prefix.length(); i++){
            char c = prefix.charAt(i);
            int asciiIndex = c - 'a';
            treeNode = treeNode.getChild(asciiIndex);
        }

        collect(treeNode, prefix, allWords);
        return allWords;
    }

    public String longestCommonPrefix(){
        Node treeNode = root;
        String lcp = "";

        while(countNumOfChildren(treeNode) == 1 && !treeNode.isLeaf()){
            treeNode = treeNode.getChild(indexOfSingleChild);
            lcp = lcp + String.valueOf((char) (indexOfSingleChild + 'a'));
        }

        return lcp;
    }

    private int countNumOfChildren(Node treeNode){
        int numOfChildren = 0;

        for(int i = 0; i < treeNode.getChildren().length; i++){
            if(treeNode.getChild(i) != null){
                numOfChildren++;
                indexOfSingleChild = i;
            }
        }

        return numOfChildren;
    }

    private void collect(Node node, String prefix, List<String> allWords){
        if(node == null){
            return;
        }

        if(node.isLeaf()){
            allWords.add(prefix);
        }

        for(Node childNode : node.getChildren()){
            if(childNode == null){
                continue;
            }

            String childCharacter = childNode.getCharacter();
            collect(childNode, prefix + childCharacter, allWords);
        }
    }

    public Integer searchAsMap(String key){
        Node treeNode = root;

        for(int i = 0; i < key.length(); i++){
            char c = key.charAt(i);
            int asciiIndex = c - 'a';

            if(treeNode.getChild(asciiIndex) != null){
                treeNode = treeNode.getChild(asciiIndex);
            }
            else{
                return null;
            }
        }

        return treeNode.getValue();
    }
}