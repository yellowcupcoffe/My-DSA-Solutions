class Solution {

public void rotate(int[] nums, int k) {
        if (nums == null || nums.length <= 1) return;

        int n = nums.length;
        k %= n;

        // Step 1: Reverse the entire array
        reverseArray(nums, 0, n - 1);
        
        // Step 2: Reverse the first k elements
        reverseArray(nums, 0, k - 1);
        
        // Step 3: Reverse the remaining n-k elements
        reverseArray(nums, k, n - 1);
    }


public static void reverseArray(int nums[], int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++; end--;
        }
    }



}