/*

Intuition: My actual intuition was to use stack but due to complexities, we are going to use array as stack. 

🚀 Game Plan
  
1️⃣ Use a Stack-like Structure
Store characters in a char array (resultStack).
Whenever the last characters match part, remove them.
  
2️⃣ Iterate Through the String
Push each character into resultStack.
If we detect a part at the end, remove it.
  
3️⃣ Return the Processed String
Convert resultStack into the final result.


*/

class Solution {
    public String removeOccurrences(String s, String part) {
        char[] st = new char[s.length()];
        char[] substring = part.toCharArray();
        char endChar = substring[substring.length - 1];
        int index = 0;

        for(char currChar : s.toCharArray()) {
            st[index++] = currChar;
            if(currChar == endChar && index >= substring.length) {
                int i = index - 1, j = substring.length - 1;

                while(j >= 0 && st[i] == substring[j]) {
                    i--;
                    j--;
                }

                if(j < 0) {
                    index = i + 1;
                }
            }
        }
        return new String(st, 0, index);
    }
}
