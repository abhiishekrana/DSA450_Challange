// 2.Lowest Common Ancestor:
// Find the lowest common ancestor of two nodes in a binary tree.
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;

class Node {
    int key;
    Node left;
    Node right;

    public Node(int data) {
        key = data;
        left = null;
        right = null;
    }
}

public class LowestCommonAncestor {
    Node root;
    ArrayList<Integer> path1 = new ArrayList<>();
    ArrayList<Integer> path2 = new ArrayList<>();

    int findLCA(int n1, int n2) {
        findPath(root, n1, path1);
        findPath(root, n2, path2);
        return findCommonAncestor();
    }

    void findPath(Node node, int n, List<Integer> path) {
        if (node == null) {
            return;
        }
        path.add(node.key);
        if (node.key == n || findPath(node.left, n, path) || findPath(node.right, n, path)) {
            return;
        }
        path.remove(path.size() - 1);
    }

    int findCommonAncestor() {
        int i;
        for (i = 0; i < path1.size() && i < path2.size(); i++) {
            if (!path1.get(i).equals(path2.get(i))) {
                break;
            }
        }
        if (i > 0) {
            return path1.get(i - 1);
        } else {
            return -1; // Handle the case where no common ancestor is found
        }
    }

    public static void main(String[] args) {
        LowestCommonAncestor tree = new LowestCommonAncestor();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        System.out.println("LCA(4, 5) = " + tree.findLCA(4, 5));
        System.out.println("LCA(4, 6) = " + tree.findLCA(4, 6));
        System.out.println("LCA(3, 4) = " + tree.findLCA(3, 4));
        System.out.println("LCA(2, 4) = " + tree.findLCA(2, 4));
    }
}
