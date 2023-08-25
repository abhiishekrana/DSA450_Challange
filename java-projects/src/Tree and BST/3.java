// Check if a binary tree is symmetric (its left and right subtrees are mirror images).
/******************************************************************************
is Symmtric tree function
*******************************************************************************/

import java.util.*;
class Node{
    int key;
    Node left;
    Node right;
    public Node(int key){
        this.key=key;
        this.left=null;
        this.right=null;
    }
}
class BinaryTree{
    Node root;
    
    boolean isMirror(Node node1,Node node2){
        if(node1==null && node2==null){
            return true;
        }
        if((node1!=null && node2!=null)&&node1.key==node2.key){
            return isMirror(node1.left,node2.right) && isMirror(node1.right,node2.left);
        }
        return false;
    }
    
    boolean isSymmetric(){
        return isMirror(root,root);
    }
    
    public static void main(String[] args){
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(4);
        tree.root.right.left =new Node(4);
        tree.root.right.right =new Node(3);
        boolean output = tree.isSymmetric();
        if(output==true){
            System.out.println("Symmtric");
        }else{
            System.out.print("not Symmtric");
        }
        
    }
    
    
}

