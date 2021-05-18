import java.util.Scanner;

public class Debug_ejercicio7 {

	public static void main (String[]args) {
		
		Scanner sdebug = new Scanner(System.in); 
		int a = 0,b = 0, sumadivisible = 0;
		
		
			
			System.out.println("Introduce numero para a:_ ");
			a = sdebug.nextInt();
			
			System.out.println("Introduce numero para b:_ ");
			b = sdebug.nextInt();
		
			if(a<b) {
				for(int i=a;i<b;i++) {
					
					
					if (i%2==0 && i%3==0) {
						System.out.println(i + " ");
						sumadivisible = sumadivisible + i;
						System.out.println("Este numero es divisible entre 2 y 3 ");
						
					} else {
					
						System.out.println("Este numero no es divisible entre 2 y 3 ");
					}
					}
			}
			
			if(b<a) {
				for(int i=b;i<a;i++) {
			
					if (i%2==0 && i%3==0) {
						System.out.println(i + " ");
						sumadivisible = sumadivisible + i;
						System.out.println("Este numero es divisible entre 2 y 3 ");
						
					} else {
					
						System.out.println("Este numero no es divisible entre 2 y 3 ");
					}
					}
			}
			
			System.out.println("########################################");
			System.out.println("########################################");
			System.out.println("La suma de los numeros divisibles entre 2 y 3 :_ " + sumadivisible);
		
	} 
}
