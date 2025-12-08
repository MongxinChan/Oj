//LC 283移动零 栈做法
#include <algorithm>
#include <vector>

using namespace std;

class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int stack_size = 0;
        for (int x : nums) {
            if (x) {
                nums[stack_size++] = x; // 把 x 入栈
            }
        }
        fill(nums.begin() + stack_size, nums.end(), 0);
    }
};