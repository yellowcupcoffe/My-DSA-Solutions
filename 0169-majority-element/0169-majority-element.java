class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int curr = 0;
        int max = 0;
        int res =0;

        for(int i=0;i<nums.length;i++){
            curr = map.getOrDefault(nums[i], 0)+1;
            map.put(nums[i] , curr );

            if(curr > max){
                 res = nums[i];
                max = curr;
            }
        }

        return res;       
    }
}