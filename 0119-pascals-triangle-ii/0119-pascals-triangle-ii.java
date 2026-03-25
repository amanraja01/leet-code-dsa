class Solution {
    public List<Integer> getRow(int rowIndex) {
    List<Integer> pre = new ArrayList<>();
     pre.add(1);
     for(int i=0;i < rowIndex; i++ ){
     List<Integer> cur = new ArrayList();
      cur.add(1);
    for(int j=1; j < pre.size(); j++){
    cur.add(pre.get(j-1)+pre.get(j));
   }
     cur.add(1);
      pre = cur;
 }
 return pre;
    }
}