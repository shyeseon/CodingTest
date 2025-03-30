import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int L, N;
    static String[] alph, arr;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        L = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        alph = new String[N];
        arr = new String[L];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            alph[i] = st.nextToken();
        }


        Arrays.sort(alph);
        combination(0, 0);
    }
    public static void combination(int idx, int cnt){
        String vowels = "aeiou";
        if(cnt == L){
            long count = Arrays.stream(arr).filter(a-> vowels.contains(a)).count();
            if(0<count && (L-count)>=2) {
                for(String st : arr){
                    System.out.print(st);
                }
                System.out.println();
            }

            return;
        }

        for(int i=idx;i<N;i++){
            arr[cnt] = alph[i];
            combination(i+1, cnt+1);
        }
    }
}
