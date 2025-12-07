#include<vector>

using namespace std;

class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int i=0,j=0;
        int a[m + n];
        int cur;
        while(i<m||j<n){
            if(i==m){
                cur=nums2[j++];
            }else if(j==n){
                cur=nums1[i++];
            }else if(nums1[i]<nums2[j]){
                cur=nums1[i++];
            }else{
                cur=nums2[j++];
            }
            a[i+j-1]=cur;
        }
        for(i=0;i!=m+n;++i){
            nums1[i]=a[i];
        }
    }
};