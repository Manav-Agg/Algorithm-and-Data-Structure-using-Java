package com.manav;

public class Node{
    private String character;
    private Node[] children;
    private int value;
    private boolean leaf;
    private boolean visited;

    public Node(String character){
        this.character = character;
        children = new Node[Constant.Alphabet_Size];
    }

    public void setChild(int index, Node node){
        node.setValue(value);
        this.children[index] = node;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public Node[] getChildren() {
        return children;
    }

    public void setChildren(Node[] children) {
        this.children = children;
    }

    public boolean isLeaf() {
        return leaf;
    }

    public void setLeaf(boolean leaf) {
        this.leaf = leaf;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public Node getChild(int index){
        return children[index];
    }

    @Override
    public String toString() {
        return this.character;
    }
}