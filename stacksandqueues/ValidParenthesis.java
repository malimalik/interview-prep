package stacksandqueues;
/* Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.

Example 1:
Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false

Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'. 
*/

public boolean isValid(String s) {
    //1. Push all of the opening brackets to the top of the stack
    //2. If they are in the right order, when we reach the closing bracket, stack.peek() would return the corresponding
    //opening bracket
    //3. If we find the corresponding opening bracket, we pop from the stack
    //4. If all in the right order, stack would be empty.
    Stack<Character> stack = new Stack<>();
    for (char c : s.toCharArray()) {
      if (c == '{' || c == '[' || c == '(') {
        stack.push(c);
      } else if (c == '}' && !stack.empty() && stack.peek() == '{') {
        stack.pop();
      } else if (c == ']' && !stack.empty() && stack.peek() == '[') {
        stack.pop();
      } else if (c == ')' && !stack.empty() && stack.peek() == '(') {
        stack.pop();
      } else {
        return false;
      }
    }

    return stack.empty();
}
