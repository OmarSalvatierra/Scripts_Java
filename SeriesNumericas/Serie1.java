public class Serie1{
	public static void main(String args []){
	
		int i = 0; /*Declaración de variables*/

		/*Serie con for*/
		System.out.println("Serie con for: ");

		for(i = 1;  i <= 10; i++){
		
			if(i < 10){
		
				System.out.print(i + ",");

		} else{
			
				System.out.print(i);
		
			}
		}

		i = 1; /*Reiniciamos la variable a su valor 1*/

		/*Serie con while*/
		System.out.println(""); /*Salto de linea*/
		System.out.println("Serie con while: ");

		while(i <= 10){
		
			if(i < 10){

                                System.out.print(i + ",");

                } else{

                                System.out.print(i);

                        }
			
			
		i++;	


		}

		i = 1; /*Reiniciamos la variable a su valor 1*/
		
		/*Serie con do-while*/
		System.out.println("");
		System.out.println("Serie con do-while: ");

		do{
			if(i < 10){

                                System.out.print(i + ",");

                } else{

                                System.out.print(i);

                        }


                i++;

		
		}while(i <= 10);

		System.out.println("");
	} 
}	
