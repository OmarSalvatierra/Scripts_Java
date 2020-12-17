public class Jerarquia{
	public static void main(String args[]){
	
		int num_uno = 4;
		int num_dos = 4;
		int resultado = 0;

		resultado = num_uno + num_dos / 2;
		System.out.println("El resultado es: " + resultado);

		resultado = (num_uno + num_dos)/2;
		System.out.println("El resultado de la operación sin seguir el orden de los operadores es: " + resultado);
	}
}
