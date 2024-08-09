import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		int[] numbers = new int[count];
		for(int i =0; i<count;i++) {
			numbers[i]=scanner.nextInt();
		}
		int searchNum = scanner.nextInt();
		int answer =0;
		for(int i=0; i<count; i++) {
			if(numbers[i]==searchNum) {
				answer+=1;
			}
		}
		System.out.println(answer);
	}

}
