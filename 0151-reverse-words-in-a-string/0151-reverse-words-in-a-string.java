class Solution {
    public String reverseWords(String s) {
        StringBuilder str=new StringBuilder();
        String[] words=s.split(" +");
        for(int i=words.length-1;i>=0;i--){
            str.append(words[i]);
            str.append(" ");
        }
        return str.toString().trim();
    }
}