class Solution {
    public String solution(String s) {
        String answer = "";
        String[] split = s.split("");
		if(s.length()%2==1) {
			return (split[s.length()/2]);
		}else {
			return (split[s.length()/2-1]+""+split[s.length()/2]);
		}
        
    }
}