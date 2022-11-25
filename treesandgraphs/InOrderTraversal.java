package treesandgraphs;

public class InOrderTraversal {
    List<Integer> result = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
      if (root == null) return new ArrayList<Integer>();
      inorderTraversal(root.left);
      result.add(root.val);
      inorderTraversal(root.right);
      return result;
    }
}
