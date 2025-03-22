import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N,min,max;
    static int[] numbers, operators;
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        N = Integer.parseInt(st.nextToken());
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;
        numbers = new int[N];
        //덧셈, 뺄셈, 곱셈, 나눗셈
        operators =new int[4];

        st =  new StringTokenizer(bf.readLine());
        for(int i=0; i<N;i++){
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        st=new StringTokenizer(bf.readLine());
        for(int i=0;i<4;i++){
            operators[i] = Integer.parseInt(st.nextToken());
        }

        premutation(0,numbers[0]);
        System.out.println(max);
        System.out.println(min);
    }
    public static void premutation(int count, int num ){
       if(count == N-1){
           max = Math.max(num , max);
           min  = Math.min(num,min);
        return;
       }

       for(int i =0;i<4;i++){
           if(operators[i] !=0){
               operators[i]--;
               int sum = circulate(i,num, numbers[count+1]);
               premutation(count+1, sum );
               operators[i]++;
           }
       }
    }
    public static int circulate(int index, int num1, int num2){
        int sum = 0;
        switch (index) {
            case 0: sum = num1+num2;
            break;
            case 1: sum = num1-num2;
            break;
            case 2: sum = num1*num2;
            break;
            case 3: sum = num1 /num2;
        }
    return sum;
    }
}
