import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
public class Main {

	public static void main(String[] args) throws Exception{
		//입력된 단어를 담는 배열 
		//입력된 단어를 뒤집어쓴 단어 배열 
		//둘을 비교해서 같은 값을 출력
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken());
		List<String> list = new ArrayList<>();
		List<String> reverse = new ArrayList<>();

		for(int i=0;i<n;i++) {
			st=new StringTokenizer(bf.readLine());
			list.add(st.nextToken());
			reverse.add(new StringBuffer(list.get(i)).reverse().toString());
		}
	
		String answer = list.stream().filter(reverse :: contains).collect(Collectors.toList()).get(0);
	
		System.out.println(answer.length()+" "+answer.split("")[answer.length()/2]);


	}

}