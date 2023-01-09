package treesandgraphs;

import java.util.*;

public class LargestValues {

  public List<Integer> largestValues(TreeNode root) {
    if (root == null) return new ArrayList<>();

    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    List<Integer> list = new ArrayList<>();

    while (!queue.isEmpty()) {
      int currMax = Integer.MIN_VALUE;
      int cursize = queue.size();
      for (int i = 0; i < cursize; i++) {
        TreeNode node = queue.poll();
        if (node.val > currMax) {
          currMax = node.val;
        }
        if (node.right != null) {
          queue.offer(node.right);
        }

        if (node.left != null) {
          queue.offer(node.left);
        }
      }

      list.add(currMax);
    }

    return list;
  }
}
