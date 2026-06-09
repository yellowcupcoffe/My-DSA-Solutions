class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();


        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            
        }

        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i]) > (nums.length/3) && !result.contains(nums[i])  ){
                result.add(nums[i]);
            }
        }

        return result;
    }
}