class Solution {
    public List<List<Integer>> generate(int numRows) {

      List<List<Integer>> list = new ArrayList<>();
      
      List<Integer> temp = new ArrayList<>(1);
         temp.add(1);
         numRows --;
         list.add(temp);

         List<Integer> prev = new ArrayList<>(1);

         for(int i = 1; i <= numRows; i++){
           List<Integer> l = new ArrayList<>();
           l.add(1);

           int s = prev.size();

           for(int j = 1; j < s; j++){
              
            l.add(prev.get(j)+prev.get(j-1));
           }    
            
           l.add(1);

           list.add(l);

           prev = l;

   }

    return list;

    }

}