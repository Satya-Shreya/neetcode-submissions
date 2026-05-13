class Solution {

    public String encode(List<String> strs) {
        StringBuilder combined=new StringBuilder();

        for(String word: strs){
            combined.append(word.length());
            combined.append("#");
            combined.append(word);
        }


        return combined.toString();
    }

    public List<String> decode(String str) {
        List<String> listOfWords=new ArrayList<>();

        int index=0;
        while(index < str.length()){
            int j=index;
            while(j<str.length() && str.charAt(j)!='#') {
                j++;
            }

            int len=Integer.parseInt(str.substring(index,j));
            int start=j+1;
            String word=str.substring(start,start+len);
            listOfWords.add(word);
            index=start+len;
        }

        return listOfWords;
    }
}
