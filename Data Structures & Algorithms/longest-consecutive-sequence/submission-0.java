class Solution {
    public int longestConsecutive(int[] nums) {
        int count = 0;
        HashSet<Integer> seen = new HashSet<>();
        for(int num : nums){
            seen.add(num);
        }
        for(int num : nums){
            int cnt = 0, curr = num;
            while(seen.contains(curr)){
                cnt++;
                curr++;
            }
            count = Math.max(count,cnt);
        }
        return count;
    }
}
