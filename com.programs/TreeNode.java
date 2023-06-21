package com.programs;

import java.util.ArrayList;

public class TreeNode {
    String name;
    ArrayList<TreeNode> tree;
    public TreeNode(String name){
        this.name = name;
        this.tree = new ArrayList<TreeNode>();
    }
    public void addChildren(TreeNode node) {
        this.tree.add(node);
    }
    public String print(int level) {
        String ret;
        ret = "  ".repeat(level)+name+"\n";
        for(TreeNode node : this.tree) {
            ret += node.print(level+1);
        }
        return ret;
    }
}
