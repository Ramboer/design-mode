package com.liu.mode.struct.composite;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by simon.liu on 2017/1/9.
 */
public class TreeNode {
    private String name;
    private TreeNode parent;
    private Vector<TreeNode> children = new Vector<TreeNode>();

    /**
     *constructor
     * @param name treeNode name
     */
    public TreeNode(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    /**
     * add
     * @param node TreeNode
     */
    public void add(TreeNode node) {
        children.add(node);
    }

    /**
     * remove
     * @param node treeNode
     */
    public void remove(TreeNode node) {
        children.remove(node);
    }

    /**
     * get node
     * @return  Enumeration<TreeNode>
     */
    public Enumeration<TreeNode> getNode() {
        return children.elements();
    }
}
