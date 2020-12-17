import java.util.Scanner; /*Importar la libreria Scanner para interactuar con la PC*/
public class Nombres{
	public static void main (String args[]){
	
		String nombre_uno = "", nombre_dos = "";
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Por favor ingresa el primer nombre: ");
		nombre_uno = entrada.nextLine();

		System.out.print("Por favor ingrese el segundo nombre: ");
		nombre_dos = entrada.nextLine();

		if(nombre_uno.equalsIgnoreCase(nombre_dos)){ /*.equalIgnoreCase ignora el uso de MAYUSCULAS y minusculas*/
		/*Condicional que compara los nombres*/
			System.out.println("Los nombres son iguales :D");

		}else{
		
			System.out.println("Lo nombres son diferentes :c");
		}
		
	}
}
