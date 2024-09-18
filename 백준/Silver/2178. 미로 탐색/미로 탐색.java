import java.util.*;
public class Main {
	static Queue<int[]> queue;
	static int N,M;
	static int[][] maze;
	static boolean[][] visited;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M= sc.nextInt();
		
		maze=new int[N][M];
		visited= new boolean[N][M];
		for(int i=0;i<N;i++) {
			String[] line = sc.next().split("");
			for(int j=0;j<M;j++) {
				 maze[i][j]=Integer.parseInt(line[j]);
			}
		}
		bfs(0,0) ;
		System.out.println(maze[N-1][M-1]);
	}
	public static void bfs(int a, int b) {
		//상하좌우 좌표
		int[] dx = {0,-1,0,1};
		int[] dy= {-1,0,1,0};
		
		int[] temp = {a,b};
		queue= new LinkedList<>();
		queue.add(temp);
		visited[a][b]=true;
		
		while(!queue.isEmpty()) {
			temp= queue.poll();
			for(int i=0;i<4;i++) {
				//현 위치에서 다른 상하좌우로 움직이기
				int x= temp[0]+dx[i];
				int y = temp[1]+dy[i];
				//미로 밖으로 벗어나지 않는 범위에서 
				if(x>=0 && y>=0 && x<N && y<M) {
					if(maze[x][y]!=0 && !visited[x][y]) {
						visited[x][y]=true;
						//몇 번 움직였는 지 세기
						maze[x][y] = maze[temp[0]][temp[1]]+1;
						queue.add(new int[] {x,y});
					}
				}
			}
			
		}	
	}
}
