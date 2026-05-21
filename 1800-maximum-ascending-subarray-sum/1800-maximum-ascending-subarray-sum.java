class Solution {
    public int maxAscendingSum(int[] nums) {
     int max=nums[0];
     int currentvalue=nums[0];

     for(int i=1; i<nums.length;i++){

        if(nums[i-1]<nums[i]){
          currentvalue=currentvalue+ nums[i] ;
          
        }
        else{
            max=Math.max(currentvalue,max);
             currentvalue=nums[i];
             
        
        }

     }
            max=Math.max(currentvalue,max);
            return max;

        
    }
}