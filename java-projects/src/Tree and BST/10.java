// 5.Diameter of Binary Tree:
// Find the diameter (longest path) between any two nodes in a binary tree.
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        int lheight=height(root.left);
        int rheight=height(root.right);
        int leftdiameter=diameterOfBinaryTree(root.left);
        int rightdiameter= diameterOfBinaryTree(root.right);
        System.out.println(Math.abs(rheight));
        return Math.max(lheight+rheight,Math.max(leftdiameter,rightdiameter));
    }
    int height(TreeNode node)
    {
        // base case tree is empty
        if (node == null)
            return 0;
 
        // If tree is not empty then height = 1 + max of
        //  left height and right heights
        return (1
                + Math.max(height(node.left),
                           height(node.right)));
    }

}