class Solution {
 
    public int missingNumber(int[] nums) {
 
        int n =nums.length+1;
        int sum = 0;
 
        for(int num : nums){
            sum+=num;
        } 
      
       int expectedSum = n*(n-1)/2;
       int missingNum = expectedSum - sum;
    
       return missingNum; 
    }
}