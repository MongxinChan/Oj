class Solution {
    public int[] twoSum(int[] nums, int target) {
        //由于不存在重复数字，直接用hashMap接口存储，
        //可以直接用get获得下标，其次是通过containsKey来找到key
        Map<Integer, Integer> hashMap = new HashMap<>();
        for(int j=0;;j++){
            int x = hashMap[j];
            if (hashMap.containsKey(target - x)) { // 找到了
                return new int[]{hashMap.get(target - x), j}; // 返回两个数的下标
            }
        }
    }
}