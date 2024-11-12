import java.util.*;
public class Main {

	public static void main(String[] args) {
		Queue<Integer> queue= new LinkedList<>();
		Queue<Integer> answer= new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			queue.add(i);
		}
		while(queue.size()!=1) {
			int a = queue.poll();
			answer.add(a);
			int b = queue.poll();
			queue.add(b);
		}
		for(int i: answer) {
			System.out.print(i+" ");
		}
		System.out.print(queue.poll());
	
	}

}
