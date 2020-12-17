import java.util.Scanner;
public class ArregloBiDi{
	public static void main(String args[]){
		
		int Filas = 0, Columnas = 0, Dato = 1;
		Scanner Entrada = new Scanner(System.in);
		
		System.out.println("¿Cuántas filas quieres?");
		Filas = Entrada.nextInt();

		System.out.println("¿Cuántas columnas quieres?");
		Columnas = Entrada.nextInt();

		int Matriz [][] = new int [Filas][Columnas];

		for(int j = 0; j < Filas; j++){
		
			for(int i = 0; i < Columnas; i++){
			
				Matriz[j][i] = Dato;
			       	Dato++;
				System.out.print("[" + Matriz[j][i] + "]");

			}

			System.out.println("");
			
		}

		System.out.println("");
	
	}
}
