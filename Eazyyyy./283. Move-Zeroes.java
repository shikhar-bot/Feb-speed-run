/*

Intuition: We are just swapping the non-zero numbers with the help of the initial 
   pointer for indexing.
   The Actual Intuition is A Two Pointer approach.

Approach: 
   -> Take a pointer to index the non-zero numbers in the array.
   -> Now Traverse the array and check if there is a non-zero number then put it 
      in an initial index of the same array with the help of a pointer that we created.
   -> After this place the remaining elements with zero with the help of another traversing.


*/


class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }

        while (index < nums.length) {
            nums[index++] = 0;
        }

    }
}
