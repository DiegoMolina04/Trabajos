import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class PhoneBook {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		
		try {
			
			String input = br.readLine();
			int cases;
			int [][] numbers;
			
			while (!input.equals("") && !input.equals("0")) {
				
				cases = Integer.parseInt(input);
				
				input = br.readLine();
				numbers = new int[cases][input.length()];
				
				
				for (int j =0; j < input.length(); j++) {
					
					numbers [0][j] = Integer.parseInt(input.substring(j, j+1));
				}
				
				for (int i =1; i < cases; i++) {
				

					input = br.readLine();
					for ( int j = 0; j < input.length(); j++) {
						
						numbers [i][j] = Integer.parseInt(input.substring(j, j+1));
					}
				}
				
				input = br.readLine();
			}
		}catch (Exception e){
			
		}

	}

}
