class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int low = 1;
        int high = 0;

        for(int i=0;i<piles.length;i++){
            if(piles[i] > high ){
                high = piles[i];
            }
        }

        
        
        int result = high;

        while(low <= high){

            int mid = low + (high - low)/2;

            if(canWeEat(piles, h, mid)){
                result = mid;
                high = mid -1;
            } else {
                low = mid+1;
            }
        }
         return result;
    }


    private boolean canWeEat(int arr[], int hour, int speed){
        long totalHours = 0;

        for(int i=0;i<arr.length;i++){
            totalHours+=(arr[i] + speed -1 )/speed;

        }

        return totalHours<=hour;
    }
}