package com.dataStructure.treeNode;

public class BSTMain {
    public static void main(String[] args) {

        BSTService bst = new BSTService();
        TreeNode root = null;

        int[] nodes = {50, 30, 70, 20, 40, 60, 80};

        for (int value : nodes) {
            root = bst.insert(root, value);
        }

        System.out.println("--- Árvore Binária de Busca (BST) ---");
        System.out.print("In Order: ");
        bst.inOrder(root);

        System.out.println("\n\nBusca pelo 40: " + (bst.search(root, 40) ? "Encontrado" : "Não encontrado"));
        System.out.println("Busca pelo 90: " + (bst.search(root, 90) ? "Encontrado" : "Não encontrado"));
    }
}
