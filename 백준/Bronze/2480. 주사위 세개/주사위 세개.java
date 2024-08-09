import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		int rewards = 0;
		if(num1==num2 && num2==num3) {
			rewards = 10000+num1*1000;
		} else if(num1==num2) {
			rewards = 1000+num1*100;
		}else if(num2==num3) {
			rewards = 1000+num2*100;
		}else if(num1==num3) {
			rewards = 1000+num1*100;
		}else {
			int max=0;
			if(num1>=num2 && num1>=num3) {
				max=num1;
			} else if(num2>=num3 && num2>=num1) {
				max=num2;
			}else {
				max=num3;
			}
			rewards = max*100;
		}
		System.out.println(rewards);
	}

}
