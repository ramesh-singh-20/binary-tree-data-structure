package com.alphacoder.datastructure;

import java.util.LinkedList;
import java.util.Queue;

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

    public int minimum(){
        return this.minimum(this.root);
    }

    public int minimumRecursively(){
        return this.minimumRecursively(this.root);
    }

    public int maximum(){
        return this.maximum(this.root);
    }

    public int maximumRecursively(){
        return this.maximumRecursively(this.root);
    }

    private int minimum(Node root){
        if(root== null){
            throw new UnsupportedOperationException("Tree is empty.");
        }
        Node current= root;

        while(null!= current.getLeft()){
            current= current.getLeft();
        }
        return current.getData();
    }

    private int minimumRecursively(Node root){
        if(root== null){
            throw new UnsupportedOperationException("Tree is empty.");
        }
        else if(root.getLeft()== null){
            return root.getData();
        }
        return minimumRecursively(root.getLeft());
    }

    private int maximum(Node root){
        if(root== null){
            throw new UnsupportedOperationException("Tree is empty.");
        }

        Node current= root;

        while(null!= current.getRight()){
            current= current.getRight();
        }

        return current.getData();
    }

    private int maximumRecursively(Node root){
        if(root== null){
            throw new UnsupportedOperationException("Tree is empty");
        }
        else if(root.getRight()== null){
            return root.getData();
        }
        else{
            return maximumRecursively(root.getRight());
        }
    }

    public int height(){
        return this.height(this.root);
    }

    private int height(Node root){
        if(root== null){
            return -1;
        }
         var leftTreeHeight= height(root.getLeft());
         var rightTreeHeight= height(root.getRight());

         return Math.max(leftTreeHeight, rightTreeHeight)+1;
    }

    public void breadthFirst(){
        this.breadthFirst(this.root);
    }

    private void breadthFirst(Node root){
        if(root== null){
            return;
        }

        var nodeQueue= new LinkedList<Node>();
        nodeQueue.add(root);

        while(!nodeQueue.isEmpty()){
            Node current= nodeQueue.pop();
            System.out.print(current.getData()+ " ");
            if(null!= current.getLeft()) {
                nodeQueue.add(current.getLeft());
            }
            if(null!= current.getRight()){
                nodeQueue.add(current.getRight());
            }
        }
        System.out.println();
    }
}
