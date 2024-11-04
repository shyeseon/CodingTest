import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws Exception {
		
		Map<String, Integer> map = new HashMap<>();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int n = Integer.parseInt(st.nextToken());

		String result = "No";
		int hour=0;
		for(int i=1;i<=n*4;i++) {
			st = new StringTokenizer(bf.readLine());
			if(i%4==1) {
				hour=4;
			} else if(i%4==2) {
				hour=6;
			} else if(i%4==3) {
				hour=4;
			} else if(i%4==0)  {
				hour=10;
			}
			for(int j=0;j<7;j++) {
				String name = st.nextToken();
				if(!name.equals("-")) {
					map.put(name,map.getOrDefault(name, 0)+hour);
				}

			}
		}
		if(map.isEmpty()) {
			result="Yes";
		}else {
		int max = Collections.max(map.values());
		int min = Collections.min(map.values());
		if(max-min<=12) {
			result="Yes";
		}
		}
		System.out.println(result);
		
	}

}