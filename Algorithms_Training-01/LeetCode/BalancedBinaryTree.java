package LeetCode;

public class BalancedBinaryTree {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(3, new TreeNode(4), null),
                        null),
                new TreeNode(2,
                        null,
                        new TreeNode(3, null, new TreeNode(4))));

        System.out.println(isBalanced(root));
    }


    public static boolean isBalanced(TreeNode root) {
        if (root == null) return true;

        return height(root) > -1;
    }

    public static int height(TreeNode root) {
        if (root == null) return 0;

        TreeNode left = root.left;
        TreeNode right = root.right;

        int lh = height(left);
        if (lh < 0) return -1;
        int rh = height(right);
        if (rh < 0) return -1;

        if (Math.abs(lh - rh) > 1) return -1;


        return 1 + Math.max(lh, rh);
    }


    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
    }

}
