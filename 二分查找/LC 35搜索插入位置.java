class Solution {
    public int searchInsert(int[] nums, int target) {
        // Binary search
        int n = nums.length -1;
        int left= 0 ,right=nums.length -1;
        while(left<=right){
            int mid = (right-left)/2 +left;
            if(nums[mid]<target){
                left = mid + 1; //[mid+1,right]
            } else {
                right = mid -1; //[left,mid-1]
            }
        }
        return left;
    }
}