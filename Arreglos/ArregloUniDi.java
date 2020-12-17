public class ArregloUniDi{
	public static void main (String args []){
	
		int Vector[]= new int[5];

		for(int i = 0; i < Vector.length; i++){

			Vector[i] = i + 10;
		}

		System.out.print("[" +Vector[0] + "]");
		System.out.print("[" +Vector[1] + "]");
		System.out.print("[" +Vector[2] + "]");
		System.out.print("[" +Vector[3] + "]");
		System.out.print("[" +Vector[4] + "]");

		System.out.println("");
	}
}
