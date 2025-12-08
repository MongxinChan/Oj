class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hashSet= new HashSet<Integer>();
        for(int data : nums) hashSet.add(data);
        int ans = 0;

        for(int x : nums){
            if(hashSet.contains(x-1)){//注意不是containsKey
                continue;
            }
            int y = x + 1;
            while (hashSet.contains(y)) {
                y++;
            }
            ans = Math.max(ans, y - x);
        }
        return ans;
    }
}