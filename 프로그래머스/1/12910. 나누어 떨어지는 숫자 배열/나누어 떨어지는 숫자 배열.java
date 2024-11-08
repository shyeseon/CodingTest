import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int num =0;
        for(int i : arr){
            int right = i%divisor;
            if(right==0){
                num++;
            }
        }
        if(num!=0){
            int[] answer = new int[num];
            int index=0;
            for(int i : arr){
                int right = i%divisor;
                if(right==0){
                    answer[index]=i;
                    index++;
                }
            }
             Arrays.sort(answer);
            return answer;
           
       }else{
            int[] answer = {-1};
          return answer;
       }
       
    }
}