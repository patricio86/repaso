import java.util.Scanner;

public class Buclewhile {
	
	/**
	 * 
	 * @param args
	 */
	
	public static void main (String[]args) {

		Scanner sdebug = new Scanner(System.in);
		int a = 0,b = 0, multi = 1, i = 0;		
		
			
			System.out.print("Introduce numero para multiplicar:_ ");
			a = sdebug.nextInt();
			
			System.out.print("Introduce numero veces multiplicar:_ ");
			b = sdebug.nextInt();

		
				while(i<b) {
					multi = multi * a;  
				i++;
				
				}
				System.out.print("El resultado es:_ " + multi);
				
				
			}
			
			
				
				


				
			
			
			
	}

