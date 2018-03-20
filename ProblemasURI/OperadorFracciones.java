import java.io.*;

public class OperadorFracciones {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out) );

		try
		{
			int cases = Integer.parseInt(br.readLine());
			int n=0, d=0;
			boolean b = true;
			
			for(int i = 0; i < cases; i++)
			{
				String[] expression = br.readLine().split(" ");
				
				switch(expression[3].charAt(0))
				{
					case '+': //Sum: (N1*D2 + N2*D1) / (D1*D2)
					{
						n = ( (Integer.parseInt(expression[0]) * Integer.parseInt(expression[6]))
							 + (Integer.parseInt(expression[4]) * Integer.parseInt(expression[2])) );
						d = Integer.parseInt(expression[2]) * Integer.parseInt(expression[6]);
						bw.write(n + " / " + d);
						bw.flush();
					}	
					break;
					
					case '-' :
						
						n = ( (Integer.parseInt(expression[0]) * Integer.parseInt(expression[6]))
								 - (Integer.parseInt(expression[4]) * Integer.parseInt(expression[2])) );
						d = Integer.parseInt(expression[2]) * Integer.parseInt(expression[6]);
						bw.write(n + " / " + d);
						bw.flush();
						
					case '*': 
						n = (Integer.parseInt(expression[0]) * (Integer.parseInt(expression[4]) ) );
						d = Integer.parseInt(expression[2]) * Integer.parseInt(expression[6]);
						bw.write(n + " / " + d);
						bw.flush();
						
					case '/':
						n = ( (Integer.parseInt(expression[0]) * Integer.parseInt(expression[6]))
								 );
						d =  (Integer.parseInt(expression[4]) * Integer.parseInt(expression[2]));
						bw.write(n + " / " + d);
						bw.flush();
				}
		
				if (b = false) {
					
					if (n%2 == 0 && d%2 ==0) {
						
						n = n /2;
						d = d /2;
					}else {
						b = true;
					}
				}
			}
		
		}
		catch(Exception ex) {}
	
		
	}

}