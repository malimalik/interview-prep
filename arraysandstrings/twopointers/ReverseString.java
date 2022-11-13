/**
 * Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.



Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]

 

Constraints:

    1 <= s.length <= 105
    s[i] is a printable ascii character.


 */

//Solution 1 - Use a stack
class Solution {

  public void reverseString(char[] s) {
    Stack<Character> newStack = new Stack<Character>();

    for (char c : s) {
      newStack.push(c);
    }

    for (int i = 0; i < s.length; i++) {
      s[i] = newStack.pop();
    }
  }
}

//Solution 2 - Two Pointers

class Solution {

  public void reverseString(char[] s) {
    int left = 0;
    int right = s.length - 1;

    while (left < right) {
      char temp = s[left];
      s[left] = s[right];
      s[right] = temp;
      right--;
      left++;
    }
  }
}
