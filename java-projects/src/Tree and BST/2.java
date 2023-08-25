/******************************************************************************
Tree Traversal of a Tree
*******************************************************************************/
class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data=data;
         this.left=null;
         this.right=null;
    }
    
}
class BinaryTree{
    Node root;
    int maxVal = Integer.MIN_VALUE;
    public BinaryTree(){
        root=null;
    }
    public void insert(int data){
        root = recursiveInsert(root,data);
    }
    
    public Node recursiveInsert(Node current,int data){
        if(current==null){
            return new Node(data);
        }
        if(data<=current.data){
            current.left=recursiveInsert(current.left,data);
        }else{
            current.right=recursiveInsert(current.right,data);
        }
        return current;
    }
    
    public void inOrderTraversal(Node node){
        if(node!=null){
            inOrderTraversal(node.left);
            System.out.print(node.data+" ");
            inOrderTraversal(node.right);
        }
    }
    public void recInorder(Node node){
        if(node==null){
            return;
        }
        recInorder(node.left);
        System.out.print(node.data+" ");
        recInorder(node.right);
        
    }
    public void recProrder(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.data+" ");
        recInorder(node.left);
        recInorder(node.right);
        
    }
    public void recPostOrder(Node node){
        if(node==null){
            return;
        }
        recInorder(node.left);
        recInorder(node.right);
        System.out.print(node.data+" ");
        
    }
}

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		BinaryTree tree =  new BinaryTree();
		tree.insert(2);
        tree.insert(1);
        tree.insert(3);
        
        tree.recInorder(tree.root);
        System.out.println();
        tree.recProrder(tree.root);
        System.out.println();
        tree.recPostOrder(tree.root);
        
	}
}
