import java.io.*;

public class URI1022 {
	//Programa que realiza operaciones entre fraccionarios
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out) );

		try
		{
			int cases = Integer.parseInt(br.readLine());
			int n, d;
			
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
					
					case " - ":
						
						n = ( (Integer.parseInt(expression[0]) * Integer.parseInt(expression[6]))
								 - (Integer.parseInt(expression[4]) * Integer.parseInt(expression[2])) );
						d = Integer.parseInt(expression[2]) * Integer.parseInt(expression[6]);
						bw.write(n + " / " + d);
						bw.flush();
						
					case " * ": 
						n = (Integer.parseInt(expression[0]) * (Integer.parseInt(expression[4]) ) );
						d = Integer.parseInt(expression[2]) * Integer.parseInt(expression[6]);
						bw.write(n + " / " + d);
						bw.flush();
						
					case " / " :
						n = ( (Integer.parseInt(expression[0]) * Integer.parseInt(expression[6]))
								 );
						d =  (Integer.parseInt(expression[4]) * Integer.parseInt(expression[2]));
						bw.write(n + " / " + d);
						bw.flush();
				}
				
				
			}
		}
		catch(Exception ex) {}
		
	}

}
