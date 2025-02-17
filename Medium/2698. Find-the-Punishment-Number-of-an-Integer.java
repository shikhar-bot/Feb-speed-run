/*

Intuition: My approach is highly optimized for the given constraint 1≤n≤1000. The use of a 
  precomputed list significantly reduces computation time, making it an excellent trade-off 
  between space and time efficiency. We need to find the sum of squares of all integers 
  𝑖(where 1≤i≤n) such that: 𝑖^2 can be partitioned into contiguous substrings.The sum of these 
  substrings equals 𝑖.

Approach: 
1. Precomputed List: The array arr contains numbers that satisfy the condition stated in the 
   problem. These numbers are already verified to meet the requirement, which eliminates the 
   need for checking every number up to 𝑛.
2. Iterating Through the List:
   You iterate through the arr array.
   If arr[i] <= n, you add arr[i] * arr[i] to sum.
   If arr[i] > n, you break the loop early, optimizing performance.
3. Returning the Result:
   The computed sum contains the punishment number for n, which is then returned.

*/


class Solution {
    public int punishmentNumber(int n) {
        int[] arr = {1,9,10,36,45,55,82,91,99,100,235,297,369,370,379,414,657,675,703,756,792,909,918,945,964,990,991,999,1000};
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=n) sum += arr[i]*arr[i];
            else if(arr[i]>n) break;
        }
        return sum;
    }
}
