class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n - 2; i++) {
            int x = nums[i];
            if (i > 0 && x == nums[i - 1]) continue; // 跳过重复数字
            if (x + nums[i + 1] + nums[i + 2] > 0) break; // 优化一
            if (x + nums[n - 2] + nums[n - 1] < 0) continue; // 优化二
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int s = x + nums[j] + nums[k];
                if (s > 0) {
                    k--;
                } else if (s < 0) {
                    j++;
                } else { // 三数之和为 0
                    // j = i+1 表示刚开始双指针，此时 j 左边没有数字
                    // nums[j] != nums[j-1] 说明与上一轮循环的三元组不同
                    if (j == i + 1 || nums[j] != nums[j - 1]) {
                        ans.add(List.of(x, nums[j], nums[k]));
                    }
                    j++;
                    k--;
                }
            }
        }
        return ans;
    }
};
