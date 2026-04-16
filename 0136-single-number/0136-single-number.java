class Solution {
    public int singleNumber(int[] nums) {
       

        HashSet<Integer> ans = new HashSet<>();    
for (int n : nums) {
    if (ans.contains(n)) {
        ans.remove(n); 
    } else {
        ans.add(n);    
    }
}
return ans.iterator().next();

    }
}