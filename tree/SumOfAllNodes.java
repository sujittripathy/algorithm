/**
*   Find sum of all nodes in a binary tree.
 *            10
 *          /    \
 *         17     89
 *        / \     /
 *       8   9   11
 * Output : 10+17+8+9+89+11 = 144
 */
public class SumOfAllNodes {
    public static void main(String[] str) {
        TreeNode _10 = new TreeNode(10);
        TreeNode _17 = new TreeNode(17);
        TreeNode _89 = new TreeNode(89);
        TreeNode _8 = new TreeNode(8);
        TreeNode _9 = new TreeNode(9);
        TreeNode _11 = new TreeNode(11);

        _10.left = _17;
        _10.right = _89;
        _17.left = _8;
        _17.right = _9;
        _89.left = _11;

        //initially sum is 0
        int total = sumOfNodes(_10);
        System.out.println("Sum is: " + total);
    }
   // Helper method to get the sum
    public static int sumOfNodes(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return sumOfNodes(root.left) + sumOfNodes(root.right) + root.data;
    }
}

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    public TreeNode(int data) {
        this.data = data;
    }
}