class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> hashMap = new HashMap<>();
        for (String s: strs){
            char[] sortedS = s.toCharArray();
            Arrays.sort(sortedS);
            // computeIfAbsent：如果 key 不在哈希表中，则插入一个新的 ArrayList
            hashMap.computeIfAbsent(
                new String(sortedS),_->new ArrayList<>()
                ).add(s);
        }
        return new ArrayList<>(hashMap.values());
    }
}