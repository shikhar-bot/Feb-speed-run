/*

Intuition: See If the array is rotated and sorted then there is only 
  one break in the array because of rotation and If there are more 
  than 1 break then it means the array is not sorted or rotated or both.

Approach:
  -> We are counting the breaks. 
  -> Traverse the array with two pointers (current and previous) and 
     understand the problem, If you see problem is saying array is 
     sorted so that's means there is no disturbance or break in traversing.
  -> We only have to check if array is rotated or not and it it is then
     there is only one break you are gonna find.
  -> In the last, check the break counts and If it is more than 1 then 
     it's false.

*/


class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i - 1] > nums[i]) {
                count++;
            }
        }

        if(nums[nums.length - 1] > nums[0]) {
            count++;
        }

        if(count <= 1) {
            return true;
        }

        return false;
    }
}
