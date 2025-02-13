/*

Intuition : We know there is only one swap option . So we are gonna take position 
  variable, intially it is -1. Check every base case and Go with word mapping.

Approach:
  -> Check all the base cases.
  -> Convert one of the string in the char array and take position varaible which 
     stores -1 value.
  -> Now Traverse the array and Check 
     -> if characters are matching or not and 
     -> If characters are not matching then check pos value is -1 or something else 
     -> If pos is -1 then stores current index into it and if pos is something else than -1 
        then swap current index element with the stored one and return the remaing becuase we 
        only have one swap.
  

*/

class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)) {
            return true;
        }
        if(s1.length() != s2.length()) {
            return false;
        }
      
        char[] arr = s1.toCharArray();
        int pos = -1;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != s2.charAt(i)) {
                if(pos == -1) {
                    pos = i;
                } else {
                    char temp = arr[i];
                    arr[i] = arr[pos];
                    arr[pos] = temp;
                    return String.valueOf(arr).equals(s2);
                }
            }
        }

        return s1.equals(s2);
    }
}
