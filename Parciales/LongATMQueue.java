import java.util.Scanner;

public class LongATMQueue {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n=0, grupos=1;
		n = sc.nextInt();
		int vector []= new int[n];		
		
		for (int i =0; i < n; i++) {
			vector[i]= sc.nextInt();
		}

		for (int j = 1; j < n; j++) {
			
			if(vector[j] < vector[j-1]) {
				
				grupos = grupos +1;
			}else {
				
				
			}
		}
		System.out.println(grupos);
	}

}
