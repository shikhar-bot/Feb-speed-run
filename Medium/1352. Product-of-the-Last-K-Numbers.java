/*

Intuition: The whole problem focuses on getProduct(k) function which gives last k elements 
  product from the array. So there are 2 or 3 base cases like if we got element '0' in the 
  array or If the size of the array is less than k or If k is equal to the size of the array. 
  ArrayList is the best option to use for prefix prod array because if we calculate prod of 
  last k elements everytime then the time complexity varies. 

📝 Game Plan
1️⃣ Prefix Product: Maintain cumulative product to efficiently get products of last k elements.
2️⃣ Handling Zeros: Clear the list and reset product when zero is added.
3️⃣ Efficient Querying: Avoid recalculating products by using prefix division.

*/

class ProductOfNumbers {
    List<Integer> prefix = new ArrayList<>();
    int prod = 1;

    public ProductOfNumbers() {
    }
    
    public void add(int num) {
        if(num == 0) {
            prefix = new ArrayList<>();
            prod = 1;
            return;
        }
        prod *= num;
        prefix.add(prod);
    }
    
    public int getProduct(int k) {
        if(prefix.size() < k) {
            return 0;
        }
        int ans = prefix.get(prefix.size() - 1);
        if(prefix.size() == k) {
            return ans;
        }

        return ans / prefix.get(prefix.size() - 1 - k);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */
