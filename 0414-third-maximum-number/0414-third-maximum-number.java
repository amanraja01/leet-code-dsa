class Solution {
    public int thirdMax(int[] nums) {
        int n=nums.length;
        TreeSet<Integer> st = new TreeSet<>();
        for(int i : nums)
        st.add(i);
        if(st.size()<3)
        return st.last();

        Iterator<Integer> it = st.descendingIterator();
        int cnt=0;
        while(it.hasNext()){
            cnt ++;
            int e =it.next();
            if(cnt==3)
            return e;


    }
    return 0;
}
}