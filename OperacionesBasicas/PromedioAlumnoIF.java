public class PromedioAlumnoIF{
	public static void main(String args[]){
	
	int Mate = 5;
	int Bio = 5;
 	int Qui = 3;	
	int Promedio = 0;
	
	Promedio = (Mate + Bio + Qui )/3;

	if(Promedio >= 6){
		System.out.println("El alumno aprobo con: " + Promedio);
	}
	else{
		System.out.println("El alumno reprobo con: " + Promedio);
	}	
	
	}
}
