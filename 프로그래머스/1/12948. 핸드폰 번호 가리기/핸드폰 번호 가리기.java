class Solution {
    public String solution(String phone_number) {
        String answer = "";
   		StringBuilder sb = new StringBuilder();
		String[] split = phone_number.split("");
		for(int i=0;i<split.length;i++) {
			if(i<split.length-4) {
				split[i]=split[i].replace(split[i], "*");
			}
			answer=sb.append(split[i]).toString();

		}
        return answer;
    }
}