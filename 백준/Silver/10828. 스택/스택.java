import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		Stack<Integer> stack = new Stack<>();
		int n = Integer.parseInt(st.nextToken());
		int num=0;
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(bf.readLine());
			String command = st.nextToken();
			
			if(st.hasMoreTokens()) {
				num = Integer.parseInt(st.nextToken());
			}
			if(command.equals("push")) {
				stack.push(num);
			}else if(command.equals("pop")) {
				if(stack.isEmpty()) {
					System.out.println("-1");
				}else {
					int top = stack.pop();
					System.out.println(top);
				}
			}else if(command.equals("size")) {
				System.out.println(stack.size());
			}else if(command.equals("top")) {
				if(stack.isEmpty()) {
					System.out.println("-1");
				}else {
					System.out.println(stack.peek());
				}
			}else if(command.equals("empty")) {
				if(stack.isEmpty()) {
					System.out.println("1");
				} else {
					System.out.println("0");
				}
			}
			
		}
		
	}

}
