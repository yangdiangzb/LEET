/**
Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".
**/
public class Solution {
    public String reverseString(String s) {
        int len = s.length();
        StringBuffer t = new StringBuffer();
        for(int i = len - 1; i >= 0; i--){
            t.append(s.charAt(i));
        }
        return t.toString();
        /**
        int len = s.length();
        String result = "";
        for(int i = len-1; i >= 0; i--){
            result = result + s.charAt(i);
        }
        return result;
        **/
    }
}
