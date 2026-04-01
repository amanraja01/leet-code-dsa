class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length ;
        Map<String, List<String>>  mp = new HashMap<>();
         for(int i=0; i<n;i++){
            String word = strs[i];
            char[] arr= word.toCharArray();

            Arrays.sort(arr);
            String str = new String(arr);

            if(!mp.containsKey(str)){
                mp.put(str,new ArrayList<>());
            }
            mp.get(str).add(word);
         }
         return new ArrayList<>(mp.values());

    }
}