#include<bits/stdc++.h>
#include<vector>
#include<algorithm>
#include<ranges>

using namespace std;

class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        //跑一遍，我的想法是异或结果相同。
        unordered_map<string,vector<string>> hashMap;
        for(string& s: strs){
            string sorted_s = s;
            ranges::sort(sorted_s);
            hashMap[sorted_s].push_back(s);
        }

        vector<vector<string>> ans;
        ans.reserve(hashMap.size());
        for (auto& [_,value] : hashMap){
            ans.push_back(value);
        }
        return ans;
    }
};