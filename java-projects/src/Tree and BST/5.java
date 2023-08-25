// Invert of a bianry Tree
import java.util.*;
class Node{
    int key;
    Node left;
    Node right;
    public Node(int data){
        key=data;
        left=null;
        right=null;
    }
}
class BinaryTree{
    Node root;
    void mirror(){
        root=mirror(root);
    }
    Node mirror(Node node){
        if(node == null){
            return node;
        }
        Node left = mirror(node.left);
        Node right = mirror(node.right);
        
        node.left = right;
        node.right = left;
        return node;
        
    }
    void inOrder() { inOrder(root); }
    void inOrder(Node node)
    {
        if (node == null)
            return;
 
        inOrder(node.left);
        System.out.print(node.key + " ");
 
        inOrder(node.right);
    }
    public static void main(String args[])
    {
        /* creating a binary tree and entering the nodes */
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
 
        /* print inorder traversal of the input tree */
        System.out.println(
            "Inorder traversal of the constructed tree is");
        tree.inOrder();
        System.out.println("");
 
        /* convert tree to its mirror */
        tree.mirror();
 
        /* print inorder traversal of the minor tree */
        System.out.println(
            "Inorder traversal of the mirror tree is");
        tree.inOrder();
    }
}
