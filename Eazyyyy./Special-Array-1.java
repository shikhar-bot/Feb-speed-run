/*
Intuition: If the array is special array then the sum of each pair in 
  the array is odd and If the sum is even then the array is not the 
  specail array

Approach:
  -> We are taking two pointers, initailly they are at 0 and 1 index of the array
  -> We are traversing the array with these pointers and also calculating the sum 
     of each adjacent pairs and checking if sum is even or odd.
  
  */



class Solution {
    public boolean isArraySpecial(int[] nums) {
        int i = 0;
        int j = i + 1;
        int error = 0;

        while(i < nums.length && j < nums.length) {
            int sum = nums[i] + nums[j];
            if(sum % 2 == 0) {
                return false;
            }
            i++;
            j++;  
        }

        return true;
    }
}
