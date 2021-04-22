package com.alphacoder.datastructure;

public class BinarySearchTree {
    private Node root;

    public boolean isEmpty(){
        return (this.root== null);
    }

    public void insert(int data){
        this.insert(data, this.root);
    }

    private Node insert(int data, Node root){
        if(root== null){
            root= createNewNode(data);
        }

        else if(data<= root.getData()){
            root.setLeft(insert(data, root.getLeft()));
        }

        else if(data> root.getData()){
            root.setRight(insert(data, root.getRight()));
        }
        this.root= root;
        return root;
    }

    private Node createNewNode(int data){
        Node node= new Node();
        node.setData(data);

        return node;
    }

    public boolean search(int data){
        return search(data, this.root);
    }

    private boolean search(int data, Node root){
        if(root== null){
            return false;
        }

        else if(data== root.getData()){
            return true;
        }

        else if(data<= root.getData()){
            return search(data, root.getLeft());
        }
        else {
            return search(data, root.getRight());
        }
    }
}
