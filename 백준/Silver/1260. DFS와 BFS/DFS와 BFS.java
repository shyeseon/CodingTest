import java.util.*;
public class Main {
	static Queue<Integer> queue;
	static int[][] array;
	static boolean[] visited;
	static int N,M,V;
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		N = sc.nextInt();
		M=sc.nextInt();
		V=sc.nextInt();
		visited= new boolean[N+1];
		array= new int[N+1][N+1];
		for(int i=0;i<M;i++) {
			int a = sc.nextInt();
			int b =sc.nextInt();
			array[a][b]=1;
			array[b][a]=1;
			
		}
		dfs(V);
		System.out.println();
		visited = new boolean[N+1];
		bfs(V);
		
	}
	public static void dfs(int start) {
		visited[start] = true;
		System.out.print(start+" ");
		for(int i=1;i<=N;i++) {
			if(array[start][i]==1 && !visited[i]) {
				dfs(i);
			}
		}
	}
	public static void bfs(int start) {
		queue= new LinkedList<>();
		queue.add(start);
		System.out.print(start+" ");
		visited[start]=true;
		while(!queue.isEmpty()) {
			start = queue.poll();
			for(int i=1;i<=N;i++) {
				if(array[start][i]==1 && !visited[i]) {
					queue.add(i);
					visited[i]=true;
					System.out.print(i+" ");
				}
				
				
			}
		}
	}
}
