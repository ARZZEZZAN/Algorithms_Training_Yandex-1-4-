package LeetCode;

public class LowestCommonAncestor {

    public static void main(String[] args) {
        InvertBinaryTree.TreeNode root = new InvertBinaryTree.TreeNode(6,
                        new InvertBinaryTree.TreeNode(2,
                                new InvertBinaryTree.TreeNode(0),
                                new InvertBinaryTree.TreeNode(4,
                                        new InvertBinaryTree.TreeNode(3),
                                        new InvertBinaryTree.TreeNode(5))),
                        new InvertBinaryTree.TreeNode(8,
                                new InvertBinaryTree.TreeNode(7),
                                new InvertBinaryTree.TreeNode(9)));
        InvertBinaryTree.TreeNode p = new InvertBinaryTree.TreeNode(7);
        InvertBinaryTree.TreeNode q = new InvertBinaryTree.TreeNode(9);
        InvertBinaryTree.TreeNode result = lowestCommonAncestor(root, p, q);
        System.out.println(result);
    }

    public static InvertBinaryTree.TreeNode lowestCommonAncestor(InvertBinaryTree.TreeNode root, InvertBinaryTree.TreeNode p, InvertBinaryTree.TreeNode q) {
        if (root == null || root.val == p.val || root.val == q.val) return root;

        int largest = Math.max(p.val, q.val);
        int smallest = Math.min(p.val, q.val);
        if (smallest > root.val) return lowestCommonAncestor(root.right, p, q);
        if (largest < root.val) return lowestCommonAncestor(root.left, p, q);


        return root;
    }
}
