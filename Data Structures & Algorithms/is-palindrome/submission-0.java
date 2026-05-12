class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String sentence = s;
        StringBuilder reverse = new StringBuilder(sentence).reverse();
        String revStr = reverse.toString();

        return sentence.equals(revStr);
    }
}