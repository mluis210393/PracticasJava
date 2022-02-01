import java.util.Scanner;


public class ComisionesTienda{
public static void main (String[]args){

      int venta;

  Scanner entrada = new Scanner(System.in);
  
  System.out.println("Ingresa el monto de la venta");
  venta = entrada.nextInt();

  if(venta >= 10000){
 
  System.out.println("La comision por la venta es de: " + (venta*.3));

  }else if(venta >= 5001 && venta <10000){

  System.out.println("La comision por la venta es de: " + (venta*.2));  

  }else if(venta >= 1000 && venta <= 5000){
  
  System.out.println("La comision por la venta es de: " + (venta*.1));

  }else{

  System.out.println("Esta venta no genera comisión");
  }
 } 
}