package OfferTest;

public class Demo16 {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode();
        root1.val = 8;
        root1.right = new TreeNode();
        root1.right.val = 7;
        root1.left = new TreeNode();
        root1.left.val = 8;
        root1.left.left = new TreeNode();
        root1.left.left.val = 9;
        root1.left.right = new TreeNode();
        root1.left.right.val = 2;
        root1.left.right.left = new TreeNode();
        root1.left.right.left.left = new TreeNode();
        root1.left.right.left.left.val = 4;
        root1.left.right.left.right = new TreeNode();
        root1.left.right.left.right.val = 7;

        TreeNode root2 = new TreeNode();
        root2.val = 8;
        root2.left = new TreeNode();
        root2.left.val = 9;
        root2.right = new TreeNode();
        root2.right.val = 2;

        System.out.println(hasSubtree(root1, root2));
        System.out.println(hasSubtree(root2, root1));
        System.out.println(hasSubtree(root1, root1.left));
        System.out.println(hasSubtree(root1, null));
        System.out.println(hasSubtree(null, root2));
        System.out.println(hasSubtree(null, null));
    }
    public static boolean hasSubtree(TreeNode root1,TreeNode root2) {
        boolean result = false;

        if (root1!=null && root2!=null) {
            if (root1.val == root2.val)
                result = DoesTree1HaveTree2(root1, root2);
            if (!result)
                result = hasSubtree(root1.left, root2);
            if(!result)
                result = hasSubtree(root1.right, root2);
        }
        return result;
    }
    public static boolean DoesTree1HaveTree2(TreeNode pRoot1, TreeNode pRoot2) {
        if (pRoot2 == null) // Tree2 为空
            return true;
        if (pRoot1 == null) // Tree2非空，Tree1为空
            return false;
        if (pRoot1.val != pRoot2.val) // Tree1 & Tree2非空
            return false;
        return DoesTree1HaveTree2(pRoot1.left, pRoot2.left) &&
                DoesTree1HaveTree2(pRoot1.right, pRoot2.right);

    }
}
