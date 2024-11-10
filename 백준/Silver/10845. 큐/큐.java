import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception{
		ArrayDeque<Integer> que = new ArrayDeque<>();
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken());

		for(int i=0;i<n;i++) {
			st = new StringTokenizer(bf.readLine());
			String what = st.nextToken();
			switch(what) {
			case "push":
				que.add(Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				if(!que.isEmpty()) {
					int q =que.remove();
					System.out.println(q);
				}else {
					System.out.println("-1");
				}
				break;
			case "size":
				System.out.println(que.size());
				break;
			case "empty":
				if(que.isEmpty()) {
					System.out.println("1");
				}else {
					System.out.println("0");
				}
				break;
			case "front":
				if(!que.isEmpty()) {
					System.out.println(que.peek());
				}else {
					System.out.println("-1");
				}
				break;
			case "back":
				if(!que.isEmpty()) {
					System.out.println(que.getLast());
				}else {
					System.out.println("-1");
				}
				break;
			}
			
		}
		

	}

}
