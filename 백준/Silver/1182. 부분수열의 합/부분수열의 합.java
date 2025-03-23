import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N,S,answer;
    static int[] numbers;
    static boolean[] used;
    public static void main (String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        numbers = new int[N];
        used = new boolean[N];

        st= new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        subSet(0,0);
        if (S == 0) answer--;
        System.out.println(answer);

    }
    public static void subSet(int count, int sum){
        if(count==N){
            if(sum == S){
                answer++;
            }
            return;
        }

        used[count] = true;
        subSet(count+1, sum+numbers[count]);

        used[count] = false;
        subSet(count+1, sum);

    }
}
