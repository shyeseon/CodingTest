class Solution {
    boolean solution(String s) {
		String[] string = s.toLowerCase().split("");
		boolean answer = true;
		int countP=0;
		int countY=0;
		for(int i=0;i<string.length;i++) {
			if(string[i].contains("p")) {
				countP++;
			}else if(string[i].contains("y")) {
				countY++;
			}
		}
		if(countP!=countY) {
			answer=false;
		}

        return answer;
    }
}