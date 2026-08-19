class Solution {
    public int missingNumber(int[] nums) {
        
        

        int n = nums.length;
        long expectedSum = (long) n * (n + 1) / 2;
    long actualSum = 0;
    for (int x : nums) actualSum += x;
    return (int) (expectedSum - actualSum);
    }
}