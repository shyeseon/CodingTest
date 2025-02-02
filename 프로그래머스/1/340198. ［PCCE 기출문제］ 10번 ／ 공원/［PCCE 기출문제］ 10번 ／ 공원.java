import java.util.*;
class Solution {
    public int solution(int[] mats, String[][] park) {
        int rows = park.length;
        int cols = park[0].length;
        int answer = -1;
        Arrays.sort(mats);
        for(int i=0;i<mats.length/2;i++){
            int temp = mats[i];
            mats[i]=mats[mats.length-1-i];
            mats[mats.length-1-i]=temp;
        }
        for(int size: mats){
            for(int i=0;i<=rows-size;i++){
                for(int j=0;j<=cols-size;j++){
                        if(checkArea(size, park, i, j)){
                            return  size;
                        }
                }
            }
        }
        return answer;

    }
    static boolean checkArea (int size, String[][] park, int rows, int cols){
        if (rows + size > park.length || cols + size > park[0].length) {
        return false; // 경계를 벗어나면 false 반환
    }
        for(int i=rows;i<rows+size;i++){
            for(int j=cols;j<cols+size;j++){
                if(!park[i][j].equals("-1")){
                    return false;
                }
            }
        }
        return true;
    }

}
