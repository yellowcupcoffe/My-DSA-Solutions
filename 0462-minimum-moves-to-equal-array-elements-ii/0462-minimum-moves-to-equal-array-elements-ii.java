class Solution {
    public int minMoves2(int[] nums) {
        
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length-1;
        int moves =0;

        while(start < end){
            moves+= (nums[end] - nums[start] );
            start++;
            end--;
        }

        return moves;
    }
}