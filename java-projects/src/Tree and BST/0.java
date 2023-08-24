/******************************************************************************
basic structure of tree like how to code:
*******************************************************************************/
class Node{
    int data;
    Node left;
    Node right;
    
    public Node(int data){
        this.data = data;
        this.left=null;
        this.right=null;
    }
}
class BinaryTree{
    Node root;
    public BinaryTree(){
        root=null;
    }
    
    public void insert(int data){
        root = recursiveInsert(root,data);
    }
    
    public  Node recursiveInsert(Node current, int data){
        if(current==null){
            return new Node(data);
        }
        if(data<=current.data){
            current.left=recursiveInsert(current.left,data);
        }else if(data>current.data){
            current.right=recursiveInsert(current.right,data);
        }
        System.out.println(current.data);
        return current;   
        
    }
    public void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.print(node.data + " ");
            inOrderTraversal(node.right);
        }
    }
}

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		BinaryTree tree =  new BinaryTree();
		tree.insert(20);
        tree.insert(10);
        tree.insert(15);
        tree.inOrderTraversal(tree.root);

	}
}
