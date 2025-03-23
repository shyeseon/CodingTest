import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N,M;
    static int[] numbers,arr;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        numbers = new int[N];
        arr = new int[M];
        for(int i=0;i<N;i++){
            numbers[i] = i+1;
        }

        premutation(0,0);
    }
    public static void premutation(int count, int start){
        if(count == M){
            for(int num : arr){
                System.out.print(num+" ");
            }
            System.out.println();
            return;
        }
        for(int i=start;i<N;i++){
            arr[count] = numbers[i];
            premutation(count+1,i);
        }

    }
}
