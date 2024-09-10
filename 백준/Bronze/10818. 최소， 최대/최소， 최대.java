import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n= scanner.nextInt();
		int[] nums= new int[n];
		
		for(int i=0;i<n;i++) {
			nums[i]= scanner.nextInt();
		
		}

		Arrays.sort(nums);
		int low=nums[0];
		int high= nums[n-1];
		System.out.print(low +" "+high);
	
		
	}

}
