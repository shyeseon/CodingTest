class Solution {
    public int solution(int num) {
		long longNum = num;
		int answer =0;
		while(longNum!=1 && answer<=500) {
			if(longNum%2==0) {
				longNum/=2;
			}else {
				longNum= longNum*3+1;
			}
			answer++;
			System.out.println(longNum);
		}

	     if (longNum == 1) {
             return answer;
         } else {
            return -1;
         }

        }
}