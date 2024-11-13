class Solution {
    public String solution(int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        String one = "수";
        String two = "박";
        int count =0;
        while(count!=n){
            sb.append(one);
            count++;
            
           if (count != n) {  
                sb.append(two);
                count++;
            }
        }
        answer=sb.toString();
        return answer;
    }
}