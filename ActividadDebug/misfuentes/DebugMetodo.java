import java.util.*;

public class DebugMetodo {

	public static void main(String[]args) {
		
		Scanner pedir =  new Scanner(System.in);
	
		
		System.out.println("Introduce un numero:_ ");
		int a = pedir.nextInt();
		System.out.println("Introduce otro numero:_ ");
		int b = pedir.nextInt();
		
		sumarimpar(a,b);
		
		
	}	
	
		public static void sumarimpar(int a,int b) {
			int sumaimpar = 0;
			if(a<b) {
				for(int i=a;i<=b;i++) {
					if(i%2!=0) {
						sumaimpar = sumaimpar + i;
						System.out.println(i);
					}
				}
			}
			
			System.out.println("Suma los impares es:" + sumaimpar);
			
		}
	
	
}
