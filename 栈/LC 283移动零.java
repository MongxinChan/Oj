class Solution {
    public void moveZeroes(int[] nums) {
        int stackSize = 0;
        for (int x : nums){
            if (x!=0){
                nums[stackSize++] = x;
            }
        }
        Arrays.fill(nums,stackSize,nums.length,0);
    }
}