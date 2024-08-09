import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[] list = new int[n];
		for(int i=0;i<n;i++) {
			list[i]=i+1;
		}

		for(int k=0;k<m;k++) {
			int i= scanner.nextInt()-1;
			int j= scanner.nextInt()-1;
			for(int l=i;l<=j;l++) {
				int h= j--;
				int temp =list[l];
				list[l]=list[h];
				list[h]=temp;
				
			}
		}
		for(int k=0;k<n;k++) {
			System.out.print(list[k]+" ");

		}
		scanner.close();
 	}

}
