package com.manav;

public class redBlackTree implements Tree{
    private Node root;

    @Override
    public void traverse() {
        if(root != null){
            inOrderTraversal(root);
        }
    }

    private void inOrderTraversal(Node node){
        if(node.getLeftChild() != null){
            inOrderTraversal(node.getLeftChild());
        }

        System.out.println(node + " - ");

        if(node.getRightChild() != null){
            inOrderTraversal(node.getRightChild());
        }
    }

    private void rightRotate(Node node){
        System.out.println("Rotating to the right on Node " + node);
        Node tempLeftNode = node.getLeftChild();
        node.setLeftChild(tempLeftNode.getRightChild());

        if(node.getLeftChild() != null){
            node.getLeftChild().setParent(node);
        }

        tempLeftNode.setParent(node.getParent());
        if(tempLeftNode.getParent() == null){
            root = tempLeftNode;
        }
        else if(node == node.getParent().getLeftChild()){
            node.getParent().setLeftChild(tempLeftNode);
        }
        else{
            node.getParent().setRightChild(tempLeftNode);
        }

        tempLeftNode.setRightChild(node);
        node.setParent(tempLeftNode);
    }

    private void leftRotate(Node node){
        System.out.println("Rotating to the left on Node " + node);
        Node tempRightNode = node.getRightChild();
        node.setRightChild(tempRightNode.getLeftChild());

        if(node.getRightChild() != null){
            node.getRightChild().setParent(node);
        }

        tempRightNode.setParent(node.getParent());
        if(tempRightNode.getParent() == null){
            root = tempRightNode;
        }
        else if(node == node.getParent().getLeftChild()){
            node.getParent().setLeftChild(tempRightNode);
        }
        else{
            node.getParent().setRightChild(tempRightNode);
        }

        tempRightNode.setLeftChild(node);
        node.setParent(tempRightNode);
    }

    @Override
    public void insert(int data) {
        Node node = new Node(data);
        root = insertIntoTree(root, node);
        fixViolations(node);
    }

    private void fixViolations(Node node){
        Node parentNode = null;
        Node grandParentNode = null;

        while(node != root && node.getColor() != nodeColor.BLACK && node.getParent().getColor() == nodeColor.RED){
            parentNode = node.getParent();
            grandParentNode = node.getParent().getParent();

            if(parentNode == grandParentNode.getLeftChild()){
                Node uncle = grandParentNode.getRightChild();

                if(uncle != null && uncle.getColor() == nodeColor.RED){
                    grandParentNode.setColor(nodeColor.RED);
                    parentNode.setColor(nodeColor.BLACK);
                    uncle.setColor(nodeColor.BLACK);
                    node = grandParentNode;
                }
                else{
                    if(node == parentNode.getRightChild()){
                        leftRotate(parentNode);
                        node = parentNode;
                        parentNode = node.getParent();
                    }

                    rightRotate(grandParentNode);
                    nodeColor tempColor = parentNode.getColor();
                    parentNode.setColor(grandParentNode.getColor());
                    grandParentNode.setColor(tempColor);
                    node = parentNode;
                }
            }
            else{
                Node uncle = grandParentNode.getLeftChild();

                if(uncle != null && uncle.getColor() == nodeColor.RED){
                    grandParentNode.setColor(nodeColor.RED);
                    parentNode.setColor(nodeColor.BLACK);
                    uncle.setColor(nodeColor.BLACK);
                    node = grandParentNode;
                }
                else{
                    if(node == parentNode.getLeftChild()){
                        rightRotate(parentNode);
                        node = parentNode;
                        parentNode = node.getParent();
                    }

                    leftRotate(grandParentNode);
                    nodeColor tempColor = parentNode.getColor();
                    parentNode.setColor(grandParentNode.getColor());
                    grandParentNode.setColor(tempColor);
                    node = parentNode;
                }
            }
        }

        if(root.getColor() == nodeColor.RED){
            root.setColor(nodeColor.BLACK);
        }
    }

    private Node insertIntoTree(Node root, Node node){
        if(root == null){
            return node;
        }

        if(node.getData() < root.getData()){
            root.setLeftChild(insertIntoTree(root.getLeftChild(), node));
            root.getLeftChild().setParent(root);
        }
        else if(node.getData() > root.getData()){
            root.setRightChild(insertIntoTree(root.getRightChild(), node));
            root.getRightChild().setParent(root);
        }
        return root;
    }
}