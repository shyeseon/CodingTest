import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int N,M;
    static int[] arr, answer;
    public static void main(String args[]) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N];
        answer = new int[M];
        for(int i=0;i<N;i++){
            arr[i]=i+1;
        }

        combination(0,0);

    }
    public static void combination(int start, int count){
        if(count == M){
            for(int num: answer){
                System.out.print(num+" ");
            }
           System.out.println();
            return;
        }

        for(int i=start; i<N;i++){
            answer[count]=arr[i];
            combination(i+1, count+1);
        }
    }
}
