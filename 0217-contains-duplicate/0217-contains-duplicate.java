class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();


        int check =0;
        for(int i=0;i<nums.length;i++){
            
            if(!set.contains(nums[i])){
                 set.add(nums[i]);
            } else {
                check++;
            }
           
        }

        boolean ans = (check==0)?  false : true;

        return ans;

        
    }
}