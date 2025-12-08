//LC 287寻找重复数
#include <algorithm>
#include <vector>

using namespace std;

class Solution {
public:
    int findDuplicate(vector<int>& nums) {
        int slow = 0, fast =0;//Initialize 0 ->array cant out range
        while(true){
            slow = nums[slow];       //Equvilently slow = slow.next;
            fast= nums[nums[fast]];  // fast = fast.next.next;
            if(fast == slow){
                break;
            }
        }

        int head = 0;
        while(slow !=head){
            slow = nums[slow];
            head = nums[head];
        }
        return slow;
    }
};