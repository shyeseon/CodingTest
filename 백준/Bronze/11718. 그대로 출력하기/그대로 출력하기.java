import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		List<String> list = new ArrayList<>();
		while(sc.hasNext()) {
			String line = sc.nextLine();
		
			if(line.isEmpty()) {
				break;
			}
			System.out.println(line);
		}	
	}

}