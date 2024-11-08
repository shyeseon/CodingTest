class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        String[] a = String.valueOf(x).split("");
		int sum=0;
		for(String i: a ) {
			sum+=Integer.parseInt(i);
		}

		if(x%sum==0) {
			answer=true;
		}
        return answer;
    }
}