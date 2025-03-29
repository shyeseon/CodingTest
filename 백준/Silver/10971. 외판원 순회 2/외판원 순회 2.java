import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, min;
    static int[][] travel;
    static boolean used[];
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        N = Integer.parseInt(st.nextToken());
        min = Integer.MAX_VALUE;
        travel = new int[N][N];
        used = new boolean[N];

        for(int i=0;i<N;i++){
            st = new StringTokenizer(bf.readLine());
            for(int j=0;j<N;j++){
                travel[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i= 0; i<N;i++){
            used[i] = true;
            premutation(i,i,0,1);
            used[i]= false;
        }

        System.out.println(min);

    }
    public static void premutation(int start, int dest, int sum, int count){
        if(count == N){
            if(travel[dest][start]!= 0){
                min  = Math.min(min, sum+travel[dest][start]);
            }
            return;
        }

        for (int i=0;i<N;i++){
            if(used[i] != true && travel[dest][i] != 0){
                used[i] = true;
                premutation(start, i,sum+travel[dest][i], count+1);
                used[i]= false;
            }
        }
    }
}
