package com.liu.mode.struct.composite;

/**
 * Created by simon.liu on 2017/1/9.
 */
public class Tree {
    private  TreeNode root = null;

    /**
     * construct tree
     * @param name string
     */
    public Tree(String name) {
        root = new TreeNode(name);
    }

    /**
     * test main
     * @param args String[]
     */
    public static void main(String[] args) {
        Tree tree = new Tree("A");
        TreeNode treeNodeB = new TreeNode("B");
        TreeNode treeNodeC = new TreeNode("C");
        treeNodeB.add(treeNodeC);
        tree.root.add(treeNodeB);
        System.out.println("finish....................");


    }
}
