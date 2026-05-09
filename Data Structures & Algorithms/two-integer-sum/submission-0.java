class Solution {
    public int[] twoSum(int[] nums, int target) {
        int length=nums.length;

        int startIndex=0;
        int endIndex=0;

        HashMap<Integer,Integer> sumSet=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int currentNum=nums[i];

            if(!sumSet.isEmpty() && sumSet.containsKey(currentNum)){
                startIndex=sumSet.get(currentNum);
                endIndex=i;
                break;
            }

            int remaining=target-currentNum;
            sumSet.put(remaining,i);
        }


        int targetIndices[]=new int[2];
        targetIndices[0]=startIndex;
        targetIndices[1]=endIndex;
        return targetIndices;
    }
}
