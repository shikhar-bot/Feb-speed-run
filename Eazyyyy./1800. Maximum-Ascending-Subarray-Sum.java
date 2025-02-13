/*

Intuition: We have to just track the strictly Increasing Subarray and do sum of each 
  element until any break and If there are breaks in the array then after every break 
  we take max sum.

Approach: 
  -> Take max variable for tracking sum.
  -> Take sum varaible, initially it contains first element of the array because we are 
     traversing the array from first index because of the conditions.
  -> Now Traverse the array with the break conditions and don't forget to take max sum 
     after every break.


*/




class Solution {
    public int maxAscendingSum(int[] nums) {
        int maxS = 0;
        int sum = nums[0];

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] <= nums[i - 1]) {
                maxS = Math.max(maxS, sum);
                sum = 0;
            }

            sum += nums[i];
        }

        maxS = Math.max(maxS, sum);
        return maxS;
    }
}
