package stacksandqueues;

/*
 * You are given a string s consisting of lowercase English letters. A duplicate removal consists of choosing two adjacent and equal letters and removing them.

We repeatedly make duplicate removals on s until we no longer can.

Return the final string after all such duplicate removals have been made. It can be proven that the answer is unique.

 

Example 1:

Input: s = "abbaca"
Output: "ca"
Explanation: 
For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.  The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".
Example 2:

Input: s = "azxxzy"
Output: "ay"
 

Constraints:

1 <= s.length <= 105
s consists of lowercase English letters.
 */

  public String removeDuplicates(String s) {
    //1. Convert the string into toCharArray
    //2. Put all the characters into a stack
    //3. If the current character is the same as the character top of the stack, it is an adjacent duplicate.
    //4. Remove the character, and keep repeating until there are no adjacent duplicates
    //5. Return the value of the String using the characters from the stack

    Stack<Character> stack = new Stack<>();

    for (char c : s.toCharArray()) {
      if (!stack.empty() && c == stack.peek()) {
        stack.pop();
      } else {
        stack.push(c);
      }
    }

    //Need to use a StringBuilder, provides us with O(1) time complexity with the append method
    StringBuilder b = new StringBuilder();
    while (!stack.empty()) {
      b.append(stack.pop());
    }

    return b.reverse().toString();
  }
