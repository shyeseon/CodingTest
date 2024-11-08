
class Solution {
    public long solution(long n) {
        long answer = 0;
     	double a = Math.sqrt(n);
		if(a==(long) a) {
            double num = (a+1)*(a+1);
			answer=(long) num;
		}else {
			answer=-1;
		}
			

        return answer;
    }
}