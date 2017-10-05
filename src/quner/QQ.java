package quner;
import java.util.ArrayList;

 class TreeNode {
 int val = 0;
 TreeNode left = null;
 TreeNode right = null;

 public TreeNode(int val) {
 this.val = val;

 }

 }
public class QQ {



        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int num = 0;
        public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {

            if(root==null){
                return result;
            }
            boolean isLeaf = root.left==null&&root.right==null;
            num+=root.val;
            arr.add(root.val);
            if(num==target&&isLeaf){
                ArrayList<Integer> path = new ArrayList<Integer>();
                for(int i=0;i<arr.size();i++){
                    path.add(arr.get(i));
                }
                result.add(path);
            }
            if(num<target&&root.left!=null){
                FindPath(root.left,target);
            }
            if(num<target&&root.right!=null){
                FindPath(root.right,target);
            }
            num-=root.val;
            arr.remove(arr.size()-1);
            return result;
        }

    }
