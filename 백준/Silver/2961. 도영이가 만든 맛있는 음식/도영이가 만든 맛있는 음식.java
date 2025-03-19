import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, min;
    static boolean[] used;
    static int[] S,B;
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        N = Integer.parseInt(st.nextToken());
        used = new boolean[N];
        S = new int[N];
        B = new int[N];
        min = Integer.MAX_VALUE;
        for(int i=0;i<N;i++){
            st= new StringTokenizer(bf.readLine());
            S[i] = Integer.parseInt(st.nextToken());
            B[i] = Integer.parseInt(st.nextToken());
        }

        subSet(0,1,0,0);
        System.out.println(min);

    }
    private static void subSet(int index, int s, int b,int count){
        if(index==N){
            for(int i=0;i<N;i++){
                if(count>0) {
                        min = Math.min(min,Math.abs(s-b));
                }
            }
            return;
        }

        subSet(index+1,s*S[index],b+B[index],count+1);

        subSet(index+1,s,b,count);
    }
}
