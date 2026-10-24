class Solution {
    public List<Integer> getRow(int rowIndex) {

        List<Integer> list = new ArrayList<>();
        list.add(1);                                  // row 0 = [1]

        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> l = new ArrayList<>();
            l.add(1);

            int s = list.size();

            for (int j = 1; j < s; j++) {
                l.add(list.get(j) + list.get(j - 1));
            }

            l.add(1);
            list = l;
        }

        return list;
    }
}