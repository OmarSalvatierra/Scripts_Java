public class Condicionales {
	public static void main (String args []){
	
		int Operacion = 1;
		int num_uno = 8;
		int num_dos = 4;
		int Resultado = 0;

		if(Operacion == 1){
			Resultado = num_uno + num_dos;
			System.out.println("El resultado de la suma es: " + Resultado);
		}
		else if(Operacion == 2){
 			Resultado = num_uno - num_dos;		
			System.out.println("El resultado de la resta es: " + Resultado);
		}
		else if(Operacion == 3){
			Resultado = num_uno *  num_dos;
			System.out.println("El resultado de la multiplicación  es: " + Resultado);
		}
		else if(Operacion == 4){
                        Resultado = num_uno /  num_dos;
                        System.out.println("El resultado de la división  es: " + Resultado);		
		}
		else {
			System.out.println("La opción que elegiste no existe");
		}
	}
}
