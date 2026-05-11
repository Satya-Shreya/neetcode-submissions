class Solution {
    public boolean isValid(String s) {
        Stack<Character> validCheck=new Stack<>();


        for(char individual:s.toCharArray()){
            if(individual=='(' || individual=='[' || individual=='{'){
                validCheck.add(individual);
            }
            else{
                if((!validCheck.isEmpty()) &&((individual==')' && validCheck.peek()=='(') || (individual==']' && validCheck.peek()=='[') || (individual=='}' && validCheck.peek()=='{') )){
                    validCheck.pop();
                }
                else{
                    validCheck.add(individual);
                }
            }
        }

        return validCheck.isEmpty();
    }
}
