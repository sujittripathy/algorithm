/** 
    Program to search an element in BST, if not found then
    return the closest possible element. The closest element
    is the one which has less difference from the returned number.
              30
         21        56 
      11         40   70
               32
 */
public class FindClosestElementBST {
    TreeNode minNode = null;

     public static void main(String[] str) {
        //Create the Tree
        TreeNode root = new TreeNode(30);
        TreeNode _21 = new TreeNode(21);
        TreeNode _56 = new TreeNode(56);
        TreeNode _11 = new TreeNode(11);
        TreeNode _40 = new TreeNode(40);
        TreeNode _70 = new TreeNode(70);
        TreeNode _32 = new TreeNode(32);

        root.left = _21;
        root.right = _56;
        _21.left = _11;
        _56.left = _40;
        _56.right = _70;
        _40.left = _32;

        //call the function
        int target = 32;
        FindClosestElementBST obj = new FindClosestElementBST();
        obj.findElement(root, target, Integer.MAX_VALUE);
        System.out.println("Min node is : " + obj.minNode.data);
    }

    private void findElement(TreeNode root, int target, int maxSoFar) {
         if(root == null) {
             return;
         }    
         //If root value is less than maxSoFar assign the new node   
         int currDiff = Math.abs(root.data - target);
         if( currDiff < maxSoFar) {
             maxSoFar = currDiff;
             minNode = root;
         }
         //if target greater than root go right else go left
         if(target > root.data) {
             findElement(root.right, target, maxSoFar);
         } else {
             findElement(root.left, target, maxSoFar);
         }
    }
}

class TreeNode {
    public int data;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int data) {
        this.data = data;
    }
}