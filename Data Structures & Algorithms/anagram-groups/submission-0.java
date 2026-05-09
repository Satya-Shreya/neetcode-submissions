class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> anagramsGroup=new ArrayList<>();
        HashMap<String, List<String>> setsSeparation=new HashMap<>();

        for(String currentStr: strs){
            char charsArray[]=currentStr.toCharArray();
            Arrays.sort(charsArray);
            String sortedString=new String(charsArray);

            if(setsSeparation.containsKey(sortedString)){
                List<String> keyList=setsSeparation.get(sortedString);
                keyList.add(currentStr);
            }
            else{
                List<String> newList=new ArrayList<>();
                newList.add(currentStr);
                setsSeparation.put(sortedString,newList);
            }

        }

        for(List<String> lists:setsSeparation.values()){
            anagramsGroup.add(lists);
        }

        return anagramsGroup;
    }
}
