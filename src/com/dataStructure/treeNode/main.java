package com.dataStructure.treeNode;

public class main {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(
                10,
                new TreeNode(5, new TreeNode(2), new TreeNode(7)),
                new TreeNode(15, null, new TreeNode(20))
        );
        System.out.println("Root: " + root.val);
        System.out.println("Left: " + root.left.val);
        System.out.println("Right: " + root.right.val);
    }
}

