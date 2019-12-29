/**
The below code shows how to traverse a tree nodes
as preorder, inorder and postorder with recursion.
           1
         /  \
        2    3 
      /  \  / \
     4   5 6   7

     inorder : 4,2,5,1,6,3,7
     preorder : 1,2,4,5,3,6,7
     postorder: 4,5,2,6,7,3,1
*/

public class TreeTraversal {
    public static void main(String[] str) {
        //create the Tree structure
        TreeNode one = new TreeNode(1); //root
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        TreeNode six = new TreeNode(6);
        TreeNode seven = new TreeNode(7);
        
        one.left = two;
        one.right = three;
        two.left = four;
        two.right = five;
        three.left = six;
        three.right = seven;

        System.out.println("\n InOrder ::");
        inorderDfs(one);
        System.out.println("\n PreOrder ::");
        preorderDfs(one);
        System.out.println("\n PostOrder ::");
        postorderDfs(one);
    }

    // inorder : L,N,R
    static void inorderDfs(TreeNode node) {
        if(node == null) {
        return;
        }
        inorderDfs(node.left);
        System.out.print(node.data + ",");
        inorderDfs(node.right);
    }
    // preorder : N,L,R
    static void preorderDfs(TreeNode node) {
        if(node == null) {
        return;
        }
        System.out.print(node.data + ",");
        preorderDfs(node.left);
        preorderDfs(node.right);
    }

    // postorder : L,R,N
    static void postorderDfs(TreeNode node) {
        if(node == null) {
        return;
        }
        postorderDfs(node.left);
        postorderDfs(node.right);
        System.out.print(node.data + ",");
    }
}

/*
    TreeNode class.
    Fields are declared as public for brevity
*/
class TreeNode {
  public int data;
  public TreeNode left;
  public TreeNode right;

  public TreeNode(int data) {
    this.data = data;
  }
}