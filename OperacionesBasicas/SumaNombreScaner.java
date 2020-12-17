import java.util.Scanner;

public class SumaNombreScaner{
	public static void main (String args[]){
	
		Scanner	entrada = new Scanner(System.in);
		String nombre = "";
		int num_uno = 0, num_dos = 0, resultado = 0;

		System.out.println("¿Cúal es tu nombre?");
		nombre = entrada.nextLine();
		
		System.out.println("Dame el primer valor para tu suma");
		num_uno = entrada.nextInt();
		
		System.out.println("Dame el segundo  valor para tu suma");
		num_dos = entrada.nextInt();

		resultado = num_uno + num_dos;

		System.out.println("Hola " + nombre + " el resultado de tu suma es " + resultado);

	}
}
