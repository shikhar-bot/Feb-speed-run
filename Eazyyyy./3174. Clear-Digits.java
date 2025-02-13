/*

Intuition: So my actual intuition was to use stack but if we use stack, it gonna 
  be complex. So here we are using String Builder because It has same features like 
  stack in this case. Now traverse and check all the condition.

Approach:
  -> Create instance of String Builder.
  -> Traverse the array and check if character is digit or not and length of 
     the StringBuilder is more than 0.
  -> If above condition is matched the delete the character from the StringBuilder 
     and If not then append the character to the StringBuilder.
  -> Last convert StringBuiler into String and return it.


*/

class Solution {
    public String clearDigits(String s) {
        StringBuilder sb = new StringBuilder();
      
        for(char ch : s.toCharArray()) {
            if(Character.isDigit(ch) && sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
