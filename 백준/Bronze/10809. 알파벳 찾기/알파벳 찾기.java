import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String S= scanner.next();
		String[] index = S.split("");
		int[] list = new int[26];
		for(int i=0;i<list.length;i++) {
			list[i]=-1;
		}
		for(int i=0;i<S.length();i++) {
			char s = S.charAt(i);
			int a = 97;
			int result = s-a;
			if(result>=0) {
				list[result]=S.indexOf(index[i]);
			}
		}
		for(int i=0;i<list.length;i++) {
			System.out.print(list[i]+" ");
		}
	}

}