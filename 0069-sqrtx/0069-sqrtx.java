class Solution {
    public int mySqrt(int x) {

     if(x < 2){
        return x;
     }
       int i = 1;
       int j = x;
       int ans = 0;


      while( (long)   i*i  <=  j){
        
       long square = (long) i * i;

       if(square == x){

         return i;
          
       }
       else if (square < x){
        
          ans = i;
        
           i++;
      
       }
       else{
          j--;

       }

      }

 return ans;

    }
}