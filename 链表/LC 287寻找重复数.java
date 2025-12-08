class Solution {
    public int findDuplicate(int[] nums) {
        int slow = 0 , fast =0;
        while(true){
            slow = nums[slow];
            fast = nums[nums[fast]];
            if(fast ==slow){
                break;
            }
        }

        int head=0;
        while(head!=slow){
            slow = nums[slow];
            head = nums[head];
        }
        return slow; // 入口环就是重复元素
    }
}