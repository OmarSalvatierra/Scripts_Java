import java.util.Scanner; /*Importar libreria Scanner*/
public class Substring{
	public static void main (String args[]){
	
		String cadena_org = "", cadena_substraccion = "";
		int num_caracteres = 0, desde = 0, hasta = 0;
		Scanner in = new Scanner(System.in);

		System.out.print("Introduce una cade de caracteres ");
		cadena_org = in.nextLine();

		num_caracteres = cadena_org.length();

		System.out.println("La cadena de caracteres " + cadena_org + " tiene " +
			       	num_caracteres + "caracteres");
		
		System.out.println("¿Desde que caracter desea obtener la nueca cadena? ");
		desde = in.nextInt();
		System.out.println("¿Hasta que caracter desea obtener la nueca cadena? ");
	       	hasta = in.nextInt();

		cadena_substraccion = cadena_org.substring(desde, hasta);
		System.out.println("La nueva cadena es: " + cadena_substraccion );


	}
}
