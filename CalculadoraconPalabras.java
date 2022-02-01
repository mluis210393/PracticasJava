import java.util.Scanner;


public class CalculadoraconPalabras{                
  public static void main (String []args){
                

                Scanner entrada = new Scanner(System.in);
		
		String valorUno, valorDos, strCompara = "";
		
		int numOpcion, varUno, varDos;
        	
                for(int i = 1; i!=0; i++){	

		System.out.println("*************");
		System.out.println("  Bienvenidos a nuestro programa :D");
		System.out.println("*************");
             
                
            	System.out.print("Ingrese la primer palabra: ");
		valorUno = entrada.nextLine();
                System.out.println("");		
                System.out.println("");

		System.out.print("Ingrese la segundo palabra: ");
		valorDos = entrada.nextLine();
                System.out.println("");                
                System.out.println("");		

		System.out.println("1. Suma\n2. Resta\n3. Multiplicacion\n4. Division");
		System.out.println("*************");
		System.out.println("Digite la opcion");
		numOpcion = entrada.nextInt();
		
		varUno = valorUno.compareTo(strCompara);
		varDos = valorDos.compareTo(strCompara);
		
		switch (numOpcion) {
			case 1:
				System.out.println(varUno+varDos);
				break;
			case 2:
				System.out.println(varUno-varDos);
				break;
			case 3:
				System.out.println(varUno*varDos);
				break;
			case 4:
				if(varDos!=0) {
					System.out.println(varUno/varDos);
				}else {
					System.out.println("No se puede dividir entre cero porque no escribiste la segunda palabra :'(");
				}
				break;
			default:
				System.out.println("La opcion digitada no existe");
		}

     }
   }

}