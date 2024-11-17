import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
       	String[] split =s.split("");
		Arrays.sort(split,Collections.reverseOrder());
       	StringBuilder sb = new StringBuilder();
		for(int i=0;i<split.length;i++) {
            sb.append(split[i]).toString();
            }
		answer=sb.toString();
        return answer;
    }
}