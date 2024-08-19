import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		scanner.nextLine();
		for(int i=0; i<N;i++) {
			String[] input=scanner.nextLine().split(" ");
			
			System.out.print("Case #"+(i+1)+": ");
			int w = input.length;
			for(int j=w;j>0;j--) {
				String[] inputV = input;
				System.out.print(inputV[j-1]+" ");
			}
			System.out.println();
		}

	}

}
