package com.programs;

import java.util.*;

public class BinaryTreeLL {
    public BinaryTree root;
    public BinaryTreeLL() {
        this.root = null;
    }
    public void preOrder(BinaryTree node) {
        if(node == null) return;
        System.out.print(node.data+" ");
        preOrder(node.left);
        preOrder(node.right);
    }
    public void postOrder(BinaryTree node){
        if(node==null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data+" ");
    }
    public void inOrder(BinaryTree node){
        if(node==null) return;
        inOrder(node.left);
        System.out.print(node.data+" ");
        inOrder(node.right);
    }
    public void levelOrder() {
        Queue<BinaryTree> queue = new LinkedList<BinaryTree>();
        queue.add(root);
        while(!queue.isEmpty()) {
            BinaryTree presentNode = queue.remove();
            System.out.print(presentNode.data+" ");
            if(presentNode.left != null) {
                queue.add(presentNode.left);
            }
            if(presentNode.right != null){
                queue.add(presentNode.right);
            }
        }
    }
}
