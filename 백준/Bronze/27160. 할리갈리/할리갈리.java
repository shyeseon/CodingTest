import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		Map<String,Integer> map = new HashMap<>();
		scanner.nextLine();
		for(int i=0;i<N;i++) {
			String[] card = scanner.nextLine().split(" ");
			String fruit = card[0];
			int count = Integer.parseInt(card[1]);
			map.put(fruit, map.getOrDefault(card[0],0)+count);
		}
		if(map.containsValue(5)) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
	}

}