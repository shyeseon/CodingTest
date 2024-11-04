import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
   	 String[] string = String.valueOf(n).split("");
		 for(String num : string) {
			 answer+=Integer.parseInt(num);
		 }

        return answer;
    }
}