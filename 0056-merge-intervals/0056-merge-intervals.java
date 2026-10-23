class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);

        List<int[]> l = new ArrayList<>();
        l.add(intervals[0]);
        int e = intervals[0][1];

        int n = intervals.length;
        int k = 0;
        for(int i = 1; i < n; i++){
       
          int s = intervals[i][0];

            if(e >= s){

                e = Math.max(e,intervals[i][1]);
                l.get(k)[1] = e; 

            }
           else{
            e=intervals[i][1];
            l.add(intervals[i]);
            k++;

           }

        }

    return l.toArray(new int[l.size()][]);
    }
}