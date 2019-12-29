/**
  Convert a sorted array, convert to BST
  Array = [1,2,3,4,5,6,7,8]

  BST = 
             4
           /  \
          2    6
        /  \  /  \
       1    3 5    7
                    \
                     8

*/

public class SortedArrayToBST {
     public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8};
        TreeNode t = bstHelper(arr, 0, arr.length-1);
        //This will print in-order traversal
        printTree(t);
     }

 private static TreeNode bstHelper(int[] arr, int start, int end) {
    if(end == -1 || start > end) {
      return null;
    }
    int mid = start + (end - start) / 2;
    //mid is the root
    TreeNode t = new TreeNode(arr[mid]);
    //build left sub-tree
    t.left = bstHelper(arr, start, mid-1);
    //build right sub-tree
    t.right = bstHelper(arr, mid+1, end);
    return t;
 }

  private static void printTree(TreeNode n) {
    if(n == null) {
      return;
    }
    printTree(n.left);
    System.out.print(n.data + ",");
    printTree(n.right);
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