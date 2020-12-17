import java.util.Scanner; /*Importamos la libreria Scanner para poder interactuar con la computadora*/
public class Login{
	public static void main(String args[]){
	
		String usuario = "", password = "";
		Scanner entrada = new Scanner(System.in); /*Creamos un método de tipo Scanner(System.in)(entrada)*/

		System.out.print("Ingresa tu nombre de usuario: ");
		usuario = entrada.nextLine(); /*La variable usuario contendra la variable entrada nextLine tipo texto*/

		System.out.print("Ingresa tu contraseña: ");                                                                                                                 password = entrada.nextLine(); /*La variable password guardara la variable entrada*/

		if(usuario.equals("omargs") && password.equals("Plastico1#")){ 
		
			System.out.println("Inicio de seción correcto :D");
			
		}else{
		
			System.out.println("Usuario o contraseña incorrecta");
		}
	}
}
