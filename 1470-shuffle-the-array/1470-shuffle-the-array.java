class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] firstHalf = new int[n];
        int[] secondHalf = new int[n];
        int length =  nums.length;
        int f=0;
        int s =0;

        for(int i=0;i<n;i++){
             firstHalf[i] =nums[i] ;
        }

        int temp= length-n;
        for(int i=0;i<n;i++){
            
            secondHalf[i] = nums[temp];
            temp++;
        }
        
        for(int i=0;i<nums.length;i++){
            if(i%2 == 0){
                nums[i] = firstHalf[f];
                f++;   
            } else {
                nums[i] = secondHalf[s];
                s++;
            }
        }

        return nums;
    }
}