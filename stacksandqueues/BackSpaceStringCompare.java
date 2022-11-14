package stacksandqueues;

import java.util.Stack;

/*
 * Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.

Note that after backspacing an empty text, the text will continue empty.

 

Example 1:

Input: s = "ab#c", t = "ad#c"
Output: true
Explanation: Both s and t become "ac".
Example 2:

Input: s = "ab##", t = "c#d#"
Output: true
Explanation: Both s and t become "".
Example 3:

Input: s = "a#c", t = "b"
Output: false
Explanation: s becomes "c" while t becomes "b".
 

Constraints:

1 <= s.length, t.length <= 200
s and t only contain lowercase letters and '#' characters.
 */

//Solution 1, using only one method


public boolean backspaceCompare(String s, String t) {
    Stack<Character> stack1 = new Stack<>();
    Stack<Character> stack2 = new Stack<>();

    for (char c : s.toCharArray()) {
      if (c != '#') {
        stack1.push(c);
      } else if (!stack1.empty()) {
        stack1.pop();
      }
    }
    for (char c : t.toCharArray()) {
      if (c != '#') {
        stack2.push(c);
      } else if (!stack2.empty()) {
        stack2.pop();
      }
    }

    return String.valueOf(stack1).equals(String.valueOf(stack2));
  }


//Solution 2, cleaned up using a stack
public boolean backspaceCompare(String s, String t) {
      return buildString(s).equals(buildString(t));
      //We can use a helper method and compare

    }

public String buildString(String s) {
    Stack<Character> stack = new Stack<>();

      for (char c : s.toCharArray()) {
        if (c != '#') {
          stack.push(c);
        } else if (!stack.empty()) {
          stack.pop();
        }
      }

      //Now, we just get the value of the string.
      return String.valueOf(stack);
    }

