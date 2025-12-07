class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int Index1 = m - 1, Index2 = n- 1,I = m + n - 1;
        while(Index2 >=0){
            if(Index1 >= 0 && nums1[Index1] > nums2[Index2]){
                nums1[I--] = nums1[Index1--];
            } else {
                nums1[I--] = nums2[Index2--];
            }
        }
    }
}