package treesandgraphs;

/*
Given the root of a binary tree, return the preorder traversal of its nodes' values.

Example 1:

Input: root = [1,null,2,3]
Output: [1,2,3]
Example 2:

Input: root = []
Output: []
Example 3:

Input: root = [1]
Output: [1]
 

Constraints:

The number of nodes in the tree is in the range [0, 100].
-100 <= Node.val <= 100
 */

public class PreOrderTraversal {

  List<Integer> result = new ArrayList<>();

  public List<Integer> preorderTraversal(TreeNode root) {
    if (root == null) return new ArrayList<Integer>();
    result.add(root.val);
    preorderTraversal(root.left);
    preorderTraversal(root.right);
    return result;
  }

  //Hello this is ben awad.
  if (head == null) return head;
  else {
    ListNode head = new ListNode(head.data);
    head = head.next;
  }

  ListNode current = head;
  while (current.next != null) {
    current = current.next;
  }

  current.next = current.next.next;
  return head.data;

}
