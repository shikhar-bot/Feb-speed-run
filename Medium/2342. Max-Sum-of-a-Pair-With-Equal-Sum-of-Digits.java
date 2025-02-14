/*

Intuition: Actually, there are two ways to solve this question either 
  you use hashmap or arr. From my side, the array method would optimized 
  one. We are going with the frequency map or array to track the elements 
  for digit sum and when you find two elements with same digit sum, add 
  them and compare the sum with max sum and also put max value between 
  both elements to map or array for next upcoming element.


Approach | 📝 Game Plan :
  
1️⃣ Sum of Digits Calculation:
For each number, calculate its sum of digits using division and modulo operations.
  
2️⃣ Track Maximum Values:
Use an array of size 82 to store the largest number for each possible digit sum.
If a second number with the same digit sum is found, calculate their sum and update the maximum result if needed.
  
3️⃣ Efficient Updates:
Keep the maximum number for each sum of digits to avoid redundant calculations.


*/

// Array Method
class Solution {
    public int maximumSum(int[] nums) {
        int[] max = new int[82];
        int ans = -1;

        for(int num : nums) {
            int curr = num;
            int sum = 0;

            // Sum of the digits
            while(curr != 0) {
                sum += curr % 10;
                curr /= 10;
            }

            if(max[sum] != 0) {
                ans = Math.max(ans, num + max[sum]);
            }
            max[sum] = Math.max(num, max[sum]);
        }

        return ans;
    }
}

// HashMap Method
class Solution {
    public int maximumSum(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int res = -1;

        for(int num : nums) {
            int curr = num;
            int sum = 0;

            while(curr != 0) {
                sum += curr % 10;
                curr /= 10;
            }

            if(map.containsKey(sum)) {
                res = Math.max(res, num + map.get(sum));
                map.put(sum, Math.max(num, map.get(sum)));
            } else {
                map.put(sum, num);
            }
        }

        return res;
    }
}
