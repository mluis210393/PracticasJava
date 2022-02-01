import java.util.Scanner;

public class BoletosCine{
public static void main (String[]args){

   Scanner entrada= new Scanner(System.in);

   int edad;
   double boleto = 7;
   int cantidad;

   System.out.println("Ingrese cantidad de boletos a comprar");
   cantidad = entrada.nextInt();

   System.out.println("Ingrese su edad");
   edad = entrada.nextInt();

   if(cantidad<=1 && edad<5){

   System.out.println("Su pago es de: " + (boleto-(boleto*.6))+ " euros");

   }else if(cantidad<=1 && edad > 60){

   System.out.println("Su pago es de: " + (boleto-(boleto *.55))+ " euros"); 
 
  }else if(cantidad >1){
  
  System.out.println("Su pago es de: " + ((cantidad * boleto)-((cantidad * boleto)*.3))+ " euros");

  }else{
  
  System.out.println("no aplica descuento");

  }
 }
}