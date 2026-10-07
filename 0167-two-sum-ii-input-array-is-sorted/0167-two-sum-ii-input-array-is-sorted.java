class Solution {
    public int[] twoSum(int[] numbers, int target) {

        HashMap<Integer,Integer> map = new HashMap<>();

        int sum = 0;

        for(int i = 0; i < numbers.length; i++) {
            sum = target - numbers[i];

            if(map.containsKey(sum)) {
                return new int[]{map.get(sum) + 1, i + 1};
            }
            else {
                map.put(numbers[i], i);
            }
        }

        return new int[]{-1, -1};
    }
}