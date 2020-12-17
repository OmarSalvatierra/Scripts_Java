import java.util.Scanner;
public class ArregloUniDi2{
	public static void main (String args[]){
	
		int Posiciones = 0;
		Scanner entrada = new Scanner(System.in);

		System.out.print("¿Cuántas números deseas ingresar?: ");
		Posiciones = entrada.nextInt();
		
		int Vector[] = new int[Posiciones];	
		
		for(int i = 0; i < Vector.length; i++){
		
			System.out.println("Por favor dame el valor # " + (i + 1));
			Vector[i] = entrada.nextInt();
		}
		
		for(int i = 0; i < Vector.length; i++){
		
			System.out.print("[" + Vector[i] + "]");
		}

		System.out.println("");
	}
}
