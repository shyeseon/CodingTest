import java.util.*;
class Solution {
    public int solution(String[] friends, String[] gifts) {
            Map<String, Integer> map = new HashMap<>();

        for(int i=0;i<friends.length;i++){
            map.put(friends[i],i);
        }
        int[][] gift = new int[friends.length][friends.length];
        int[] count = new int[friends.length];
        for(int i=0;i<gifts.length;i++){
            String[] split = gifts[i].split(" ");
            String giver = split[0];
            String reciever = split[1];
            gift[map.get(giver)][map.get(reciever)]++;
            count[map.get(giver)]++;
            count[map.get(reciever)]--;
        }
        int[] nextMonth = new int[friends.length];
        for(int i=0;i<friends.length;i++){
            for(int j=0;j<i;j++){
                if(gift[i][j]>gift[j][i]){
                    nextMonth[i]++;
                }else if(gift[i][j]<gift[j][i]){
                    nextMonth[j]++;
                }else{
                    if(count[i]>count[j]){
                        nextMonth[i]++;
                    }else if(count[j]>count[i]){
                        nextMonth[j]++;
                    }
                }
            }
        }
        Arrays.sort(nextMonth);
        return nextMonth[friends.length-1];
    }
}