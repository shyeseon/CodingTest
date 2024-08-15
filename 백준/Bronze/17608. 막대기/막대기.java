import java.util.Scanner;
import java.util.Stack;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		Stack<Integer> stick = new Stack<>();
		for(int i=0;i<N;i++) {
			 stick.push(scanner.nextInt());
		}
	
		int count=0;
		int h=0;
		for(int i=0; i<N;i++) {
			int p= stick.pop();
			if(h<p) {
				h=p;
				count++;
			}
		}
		System.out.println(count);
	}
}