import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Diamantes {

	public static void main(String[] args) {
	//Revisa cuantos parentesis se cierran al ingresar 
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (System.out));
		
		try {
			
			int cases = Integer.parseInt(br.readLine());
			String input;
			int counter = 0, temp = 0;
			
			for (int i = 0; i < cases; i++) {
				
				input = br.readLine();
				
				for(int j = 0; j < input.length(); j++ ) {
					
					if(input.charAt(j)== '<')
						temp += 1;
					
					if (input.charAt(j)== '>')
						
						if (temp > 0) {
							temp -= 1;
							counter += 1;
						}
				}
				bw.write(counter+"\n");
				bw.flush();
			}
			
		}catch ( Exception e) {}
	}

}
