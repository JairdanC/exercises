//import java.util.*;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
/* 
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> returnList = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) {
            queue.add(root);
        }
            
        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int length = queue.size();

            for (int i = 0; i < length; i++) {
                TreeNode currNode = queue.poll();
                level.add(Integer.valueOf(currNode.val));

                TreeNode temp = currNode.left;
                if (temp != null) {
                    queue.add(temp);
                }
                temp = currNode.right;
                if (temp != null) {
                    queue.add(temp);
                }
            }
            returnList.add(level);
        }
        return returnList;
    }
}
*/