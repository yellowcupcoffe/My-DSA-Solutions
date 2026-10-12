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

        while(low<=high){
            int mid = low + (high-low)/2;

            if(canWeEat(piles,mid,h)){
                result = mid;
                high = mid -1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    private boolean canWeEat(int piles[], int speed, int h){
        long totalHours = 0;

        for(int i=0;i<piles.length;i++){
            totalHours+= ( piles[i] + speed -1 )/speed;
        }

        return totalHours <=h;
    }
}