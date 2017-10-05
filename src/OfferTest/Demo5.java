package OfferTest;

import java.util.Arrays;

/**
 * 重建二叉树
 */

//二叉树定义
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) {
        this.val = val;
    }

    public TreeNode() {

    }
}
public class Demo5 {
    public static void main(String[] args) {
        int[] pre = {1,2,4,7,3,5,6,8};
        int [] in = {4,7,2,1,5,3,8,6};

    }
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if (pre==null || in==null) // 判空
            return null;
        if (pre.length != pre.length){
            System.out.println("Invalid  input.");
        }
        //生成根节点
        int rootValue = pre[0];
        TreeNode root = new TreeNode(rootValue);
        root.left = root.right = null;
        // 一个节点的情况
        if (pre.length==1) {
            if (in.length==1 && pre[0]==in[0])
                return root;
            else
            System.out.println("Invalid  input.");
    }
        // 在中序遍历中查找根节点的值
        int rootInorder =0;
        while (rootInorder<in.length && in[rootInorder]!=rootValue)
            rootInorder++;
        // 构建左子树
        int[] leftPre = Arrays.copyOfRange(pre, 1, rootInorder+1);
        int[] leftIn = Arrays.copyOfRange(in, 0, rootInorder);
        if (leftPre.length>0) {
            root.left = reConstructBinaryTree(leftPre, leftIn);
        }
        // 构建右子树
        int[] rightPre = Arrays.copyOfRange(pre, rootInorder+1, pre.length);
        int[] rightIn = Arrays.copyOfRange(in, rootInorder+1, in.length);
        if (rightPre.length>0) {
            root.right = reConstructBinaryTree(rightPre, rightIn);
        }
        return root;
    }
}
