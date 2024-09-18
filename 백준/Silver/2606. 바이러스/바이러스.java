import java.util.*;

public class Main {
	static int N, M;
	static boolean[] visited;
	static int[][] array;
	static int count=0;
	public static void main(String[] args) {
		// 너비 우선 탐색(bfs)
		Scanner sc = new Scanner(System.in);
		N= sc.nextInt();
		M = sc.nextInt();
		
		//감염 여부를 판단할 boolean 배열
		visited = new boolean[N+1];
		array = new int[N+1][N+1];
		for(int i=0;i<M;i++) {
			int a =sc.nextInt();
			int b = sc.nextInt();
			array[a][b]=1;
			array[b][a]=1;
		}
		int start=1;
		dfs(start);
		System.out.println(count);
	}
	public static void dfs(int s) {
		visited[s]=true;
		for(int i=1;i<=N;i++) {
			if(array[s][i]==1 && !visited[i]) {
				count++;
				dfs(i);
			}
		}
	}

}