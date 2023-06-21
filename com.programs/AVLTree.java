package com.programs;

import java.util.LinkedList;
import java.util.Queue;

public class AVLTree {
    AVL root;
    public AVLTree(){
        this.root = null;
    }
    public int getHeight(AVL node){
        if(node == null) return 0;
        return node.height;
    }
    private AVL rotateRight(AVL disbalancedNode) {
        AVL newRoot = disbalancedNode.left;
        disbalancedNode.left = disbalancedNode.left.right;
        newRoot.right = disbalancedNode;
        disbalancedNode.height = 1 + Math.max(getHeight(disbalancedNode.left),getHeight(disbalancedNode.right));
        newRoot.height = 1 + Math.max(getHeight(disbalancedNode.left),getHeight(disbalancedNode.right));
        return newRoot;
    }
    private AVL rotateLeft(AVL disbalancedNode) {
        AVL newRoot = disbalancedNode.right;
        disbalancedNode.right = disbalancedNode.right.left;
        newRoot.left = disbalancedNode;
        disbalancedNode.height = 1 + Math.max(getHeight(disbalancedNode.left),getHeight(disbalancedNode.right));
        newRoot.height = 1 + Math.max(getHeight(disbalancedNode.left),getHeight(disbalancedNode.right));
        return newRoot;
    }
    public int getBalance(AVL node) {
        if(node == null) return 0;
        return getHeight(node.left)-getHeight(node.right);
    }
    private AVL inserNode(AVL node,int nodeValue) {
        if(node == null) {
            AVL newNode = new AVL();
            newNode.value = nodeValue;
            newNode.height = 1;
            return newNode;
        }else if(nodeValue < node.value){
            node.left = inserNode(node.left,nodeValue);
        }else {
            node.right = inserNode(node.right,nodeValue);
        }
        node.height = 1 + Math.max(getHeight(node.left),getHeight(node.right));
        int balance = getBalance(node);
        if(balance > 1 && nodeValue < node.left.value) {
            return rotateRight(node);
        }
        if(balance > 1 && nodeValue > node.left.value) {
            node.left = rotateLeft(node.left);
            return rotateRight(node);
        }
        if(balance < -1 && nodeValue > node.right.value) {
            return rotateLeft(node);
        }
        if(balance < -1 && nodeValue < node.right.value) {
            node.right = rotateRight(node.right);
            return rotateLeft(node);
        }
        return node;
    }
    public void insert(int value){
        root = inserNode(root,value);
    }

    public void levelOrder() {
        Queue<AVL> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            AVL presentNode = queue.remove();
            System.out.print(presentNode.value+" ");
            if(presentNode.left != null) {
                queue.add(presentNode.left);
            }
            if(presentNode.right != null){
                queue.add(presentNode.right);
            }
        }
    }
}