class Solution {
    class Pair{
        int x,y;
        public Pair(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> frequencyMap=new HashMap<>();
        for(int num:nums){
            frequencyMap.put(num,frequencyMap.getOrDefault(num,0)+1);

        }

        PriorityQueue<Pair> topFrequent=new PriorityQueue<>((x,y)->y.y-x.y);
        for(int key: frequencyMap.keySet()){
            topFrequent.add(new Pair(key,frequencyMap.get(key)));
        }

        int topK[]=new int[k];

        for(int i=0;i<k;i++){
            Pair curr=topFrequent.poll();
            topK[i]=curr.x;
        }

        return topK;
    }
}


