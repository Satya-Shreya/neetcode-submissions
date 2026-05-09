class Solution {
    public boolean hasDuplicate(int[] nums) {
        int length=nums.length;

        HashSet<Integer> uniqueSet = new HashSet<>();

        for(int num:nums){
            uniqueSet.add(num);
        }


        return length!=uniqueSet.size();
        
    }
}