// root to leaf node all the paths
//Java code for the above approach
import java.util.ArrayList;
import java.util.List;

// Binary Tree representation using class where data is in integer and 2 pointers
// left and right represents left and right pointers of a node in a tree respectively
class Node {
	int data;
	Node left;
	Node right;

	Node(int x) {
		data = x;
		left = null;
		right = null;
	}
}

class GFG {
	// Recursive helper function which will recursively update our ans list.
	// it takes root of our tree, arr list and ans list as an argument
	public static void helper(Node root, List<Integer> arr, List<List<Integer>> ans) {
		if (root == null)
			return;
		arr.add(root.data);
		if (root.left == null && root.right == null) {
			/*
			* This will be only true when the node is leaf node and hence we will update
			* our ans list by inserting list arr which have one unique path from root to leaf
			*/
			ans.add(new ArrayList<Integer>(arr));
			// after that we will return since we don't want to check after leaf node
			return;
		}
		/*
		* recursively going left and right until we find the leaf and updating the arr
		* and ans list simultaneously
		*/
		helper(root.left, new ArrayList<Integer>(arr), ans);
		helper(root.right, new ArrayList<Integer>(arr), ans);
	}

	public static List<List<Integer>> Paths(Node root) {
		/*
		* creating 2-d list in which each element is a 1-d list having one unique path
		* from root to leaf
		*/
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		/* if root is null then there is no further action require so return */
		if (root == null)
			return ans;
		List<Integer> arr = new ArrayList<Integer>();
		/*
		* arr is a list which will have one unique path from root to leaf at a time. arr
		* will be updated recursively
		*/
		helper(root, arr, ans);
		/*
		* after helper function call our ans list updated with paths so we will return ans
		* list
		*/
		return ans;
	}

	public static void main(String[] args) {
		/* defining root and our tree */
		Node root = new Node(10);
		root.left = new Node(8);
		root.right = new Node(2);
		root.left.left = new Node(3);
		root.left.right = new Node(5);
		root.right.left = new Node(2);
		/* The answer returned will be stored in final 2-d list */
		List<List<Integer>> fina = Paths(root);
		/* printing paths from root to leaf */
		for (List<Integer> path : fina) {
			for (int i : path) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
