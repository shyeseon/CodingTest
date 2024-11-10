import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception{
		Queue<Integer> que = new LinkedList<>();	
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken());

		int last =0;
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(bf.readLine());
			String what = st.nextToken();
			
			switch(what) {
			case "push":
				last= Integer.parseInt(st.nextToken());
				que.add(last);
				break;
			case "pop":
				if(!que.isEmpty()) {
					sb.append(que.poll()).append("\n");
				}else {
					sb.append("-1").append("\n");
				}
				break;
			case "size":
				sb.append(que.size()).append("\n");
				break;
			case "empty":
				if(que.isEmpty()) {
					sb.append("1").append("\n");
				}else {
					sb.append("0").append("\n");
				}
				break;
			case "front":
				if(!que.isEmpty()) {
					sb.append(que.peek()).append("\n");
				}else {
					sb.append("-1").append("\n");
				}
				break;
			case "back":
				if(!que.isEmpty()) {
					sb.append(last).append("\n");
				}else {
					sb.append("-1").append("\n");
				}
				break;
			}
			
		}
		System.out.println(sb);

	}

}
