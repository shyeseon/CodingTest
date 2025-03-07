import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int N,M;
    static int[] arr,numbers;
    static boolean[] used;
    public static void main(String args[]) throws Exception{
        //중복없이  1부터 N까지 자연수 중 M개를 고른 수열 구하기

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        N = Integer.parseInt( st.nextToken());
        M = Integer.parseInt( st.nextToken());
        arr = new int[M];
        numbers = new int[N];
        used = new boolean[N];
        for(int i=0;i<N;i++){
            numbers[i]=i+1;
        }

        premutationOne(0);

    }
    public static void premutationOne(int cnt){

        if(cnt == M){
            for(int num : arr){
                System.out.println(num);
            }
            return;
        }
        for(int i=0;i<N;i++){
            if(!used[i]){
                used[i]=true;
                arr[cnt]=numbers[i];
                premutationOne(cnt+1);
                used[i]=false;
            }
        }

    }
}
