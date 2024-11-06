import java.util.*;
class Solution {
    public long solution(long n) {
        String s = ""+n;
		Integer[] array = new Integer[s.length()];
		String result ="";
		long answer=0;

		for(int i=0;i<s.length();i++) {
			 array[i] = Integer.parseInt(s.split("")[i]);
			
		}
		Arrays.sort(array, (a,b)-> b-a);
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<s.length();i++) {
			result= sb.append(array[i]).toString();

		}
		answer = Long.parseLong(result);

        return answer;
    }
}