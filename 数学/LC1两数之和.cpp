#include<bits/stdc++.h>
#include<vector>
#include<unordered_map>

using namespace std;

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int, int>temp; // 创建一个空哈希表
        for (int j = 0; ; j++) { // 枚举 j
            // 在左边找 nums[i]，满足 nums[i]+nums[j]=target
            auto it = temp.find(target - nums[j]);
            if (it != temp.end()) { // 找到了
                return {it->second, j}; // 返回两个数的下标
            }
            temp[nums[j]] = j; // 保存 nums[j] 和 j
        }
    }
};