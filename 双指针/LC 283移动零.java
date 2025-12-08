class Solution {
    public void moveZeroes(int[] nums) {
        int index0=0;
        for(int index=0 ; index<nums.length;index++){
            if(nums[index]!=0){
                int temp = nums[index];
                nums[index] = nums[index0];
                nums[index0] = temp;
                index0++;
            }
        }
    }
}