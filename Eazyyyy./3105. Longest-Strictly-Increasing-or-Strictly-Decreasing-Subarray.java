/*

Intuition: We are simply check for increasing subarray or decreasing 
  subarray separately and do track the lengths of both subarrays. 
  We are gonna find out max length from both subarray max length.

Approach: 
  -> We take two counts for increasing and decreasing subarray which 
     can track the length of the subarrays.
  -> And also take two max variables for each.
  -> Now traverse the array and check these conditions in two separate arrays:
       -> For Increasing take two pointers for counting then take max from above.
       -> Same go for the Decreasing
  -> In the last take maximum from two max length subarrays.

  */






class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int subI = 1;
        int subD = 1;
        int maxI = Integer.MIN_VALUE;
        int maxD = Integer.MIN_VALUE;

        if(nums.length == 1) {
            return 1;
        }

        for(int i = 1; i < nums.length; i++) {
            if(nums[i - 1] < nums[i]) {
                subI++;
            } else {
                subI = 1;
            }

            maxI = Math.max(maxI, subI);
        }

        for(int i = 1; i < nums.length; i++) {
            if(nums[i - 1] > nums[i]) {
                subD++;
            } else {
                subD = 1;
            }

            maxD = Math.max(maxD, subD);
        }

        int ans = Math.max(maxD, maxI);
        return ans;
    }
}
