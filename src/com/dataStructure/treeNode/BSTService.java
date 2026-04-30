package com.dataStructure.treeNode;

public class BSTService {
    public TreeNode insert(TreeNode root, int val) {

        if (root == null) {
            return new TreeNode(val);
        }

        if (val < root.val) {
            root.left = insert(root.left, val );
        } else if (val > root.val) {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public boolean search(TreeNode root, int key) {

        if (root == null) return false;
        if (root.val == key) return true;

        return key < root.val
                ? search(root.left, key)
                : search(root.right, key);
    }

    public void inOrder(TreeNode root) {

        // In Order Left, Root, Right = 1, 4 ,7, 8, 9, 11
        // Pre Order Root, Left and Right = 7, 4, 1, 9, 8, 11
        // Post Order Left, Right and Root 1, 4, 8, 11, 9, 7

        /**
         *           7
         *        /     \
         *       4       9
         *      /       / \
         *     1       8   11
         */

        if (root != null) {
            inOrder(root.left);
            System.out.println(root.val + " ");
            inOrder(root.right);
        }
    }
}
