package treesandgraphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ZigZagTraversal {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        boolean even = true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            LinkedList<Integer> interim = new LinkedList<>();
            for (int i = 0; i<size; i++) {
                TreeNode curr = queue.poll();
                if (even) {
                    interim.add(curr.val);
                }      
                else interim.addFirst(curr.val);

                if (curr.left != null) queue.offer(curr.left);
                if (curr.right != null) queue.offer(curr.right);

            }

            even = !even;
            res.add(interim);
        }

        return res;
    }
    
}
