import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N,min;
    static int[][] power;
    static boolean[] used;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        power = new int[N][N];
        used = new boolean[N];
        min = Integer.MAX_VALUE;
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++) {
                power[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        combination(0,0);
        System.out.println(min);
    }
    public static void combination(int start, int count){
        if(count == N/2){
            int sumS =0;
            int sumC =0;
            for(int i=0;i<N; i++){
                for(int j=i+1;j<N;j++){
                    if(used[i] && used[j]){
                        sumS+= power[i][j]+power[j][i];
                    }else if(!used[i] && !used[j]){
                        sumC += power[i][j]+ power[j][i];
                    }
                }
            }
            min = Math.min(min, Math.abs(sumS-sumC));
            return;
        }

        for(int i = start; i<N;i++){
            used[i] = true;
            combination(i+1, count+1);
            used[i] = false;
        }
    }
}
