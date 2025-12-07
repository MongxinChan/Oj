//双指针 LC 88两数合并 -V2版，V1在/数学 中
#include<vector>

using namespace std;

class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int Index1 = m - 1, Index2 = n- 1,I = m + n - 1;
        while(Index2 >=0){
            if(Index1 >= 0 && nums1[Index1] > nums2[Index2]){
                nums1[I--] = nums1[Index1--];
            } else {
                nums1[I--] = nums2[Index2--];
            }
        }
    }
};