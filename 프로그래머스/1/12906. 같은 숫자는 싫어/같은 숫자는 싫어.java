import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
		List<Integer> list = new ArrayList<>();
		list.add(arr[0]);
		
		for(int i=0;i<arr.length;i++) {
			if(i>0 && arr[i-1]!=arr[i]) {
				list.add(arr[i]);
			}

		}
		int count =0;
		int[] answer = new int[list.size()];
		for(int i: list) {
			answer[count++]=i;
		}
        return answer;
    }
}