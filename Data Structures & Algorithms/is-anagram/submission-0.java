class Solution {
    public boolean isAnagram(String s, String t) {
        int sLength=s.length();
        int tLength=t.length();

        if(sLength!=tLength) return false;

        HashMap<Character,Integer> sMapping=new HashMap<>();
        HashMap<Character,Integer> tMapping=new HashMap<>();

        for(int i=0;i<sLength;i++){
            char sChar=s.charAt(i);
            char tChar=t.charAt(i);


            sMapping.put(sChar,sMapping.getOrDefault(sChar,0)+1);
            tMapping.put(tChar,tMapping.getOrDefault(tChar,0)+1);
        }


        for(char keys : sMapping.keySet()){
            int val=sMapping.get(keys);
            if(!tMapping.containsKey(keys)) return false;
            if(tMapping.containsKey(keys) && tMapping.get(keys)!=val) return false;
        }

        return true;
    }
}
