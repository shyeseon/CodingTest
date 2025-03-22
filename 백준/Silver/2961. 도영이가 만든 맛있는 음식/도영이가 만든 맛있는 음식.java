import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//부분배열
public class Main {
    static int N, min;
    static int[] S,B;
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        N = Integer.parseInt(st.nextToken());
        S = new int[N];
        B = new int[N];
        min = Integer.MAX_VALUE;
        for(int i=0;i<N;i++){
            st= new StringTokenizer(bf.readLine());
            S[i] = Integer.parseInt(st.nextToken());
            B[i] = Integer.parseInt(st.nextToken());
        }

        for(int i =0;i<1<<N;i++){
            int s = 1;
            int b =0;
            for(int j=0;j<N;j++){
                if((i&1<<j)!=0){
                    s*=S[j];
                    b+=B[j];
                    min = Math.min(min, Math.abs(s-b));
                }
            }
        }

        System.out.print(min);

    }
}