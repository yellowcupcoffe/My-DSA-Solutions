class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] res = new int[2];
        int needed;

        for(int i=0;i<numbers.length;i++){
            needed = target - numbers[i];
            if(!map.containsKey(needed)){
                map.put(numbers[i], i);
            } else {
                res[0] = map.get(needed)+1;
                res[1] = i+1;
            }
        }

        return res;
    }
}