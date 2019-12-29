import java.util.*;

/**
*       90
*      /  \
*     30   200
*          /  \
*         150  290
*              /
*             255
*              \
*               285
                  \
                  289
*/
public class FindMaxBST {
    public static void main(String[] str) {
        // TreeNode root = new TreeNode(90,
        //         new TreeNode(30, null, null),
        //             new TreeNode(200, new TreeNode(150, null, null),
        //                 new TreeNode(290, null, null)));
        

        // TreeNode root1 = new TreeNode(90,
        //         new TreeNode(30, null, null),
        //             new TreeNode(200, new TreeNode(150, null, null),
        //                 new TreeNode(290, new TreeNode(255,null,
        //                         new TreeNode(285, null,
        //                                 new TreeNode(289, null,null))), null)));
        // int maxSecond = new FindMaxBST().findSecondMax(root1);
        // System.out.println(maxSecond);
    }

    // private int findSecondMax(TreeNode node) {
    //     if(node.getRight() != null) {
    //         return findSecondMax(node.getRight());
    //     }
    //     if(node.getLeft() != null) {
	// 		return findSecondMax(node.getLeft());
	// 	}
    //     return node.getVal();
    // }
    
}

// class TreeNode {
//     private int val;
//     private TreeNode left;
//     private TreeNode right;

//     public TreeNode(int val, TreeNode left, TreeNode right) {
//         this.val = val;
//         this.left = left;
//         this.right = right;
//     } 

//     public int getVal() {
//         return val;
//     }
    
//     public TreeNode getLeft() {
//         return left;
//     }

//     public TreeNode getRight() {
//         return right;
//     }
// }
