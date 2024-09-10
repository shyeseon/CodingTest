import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st =new StringTokenizer(bf.readLine());
		int hour = Integer.parseInt(st.nextToken());
		int second= Integer.parseInt(st.nextToken());
		st =new StringTokenizer(bf.readLine());
		int takeTime = Integer.parseInt(st.nextToken());
		int howlong = second+takeTime;
		while(howlong>=60) {
			hour+=1;
			howlong-=60;
			if(hour>=24) {
				hour-=24;
			}
		}
		
		System.out.println(hour+" "+ howlong);
		
	}

}