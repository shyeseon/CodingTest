import java.util.*;
class Solution {
    public int[] solution(int n, String[] words){
HashSet<String> hashSet = new HashSet<>();
		int[] answer = {0,0};
  for(int i=0;i<words.length;i++) {
            
            	String fw = words[i];  	
       
                if(hashSet.contains(words[i]) || (i>0 &&!fw.startsWith(String.valueOf(words[i-1].charAt(words[i-1].length()-1)))) || fw.length()==1) {

                	if((hashSet.size()+1)%n==0) {
                		System.out.println("if"+hashSet.size());
                		answer[0]=n;
                		answer[1] = (hashSet.size()+1)/n; 
                	}else {
                		System.out.println("else"+hashSet.size());
                		answer[0] = hashSet.size()%n+1;
                		answer[1] = ((hashSet.size()+1)/n)+1; 
                	}
                	return answer;
                }else {
                	hashSet.add(words[i]);
                	
                }
            }
        return answer;
    }
}