import java.util.Scanner;


public class ClassGrader{
 public static void main (String[]args){
       
     int calificacion;

     Scanner entrada = new Scanner(System.in);

     System.out.println("Ingresa calificación");
     
     calificacion = entrada.nextInt();
  
    if(calificacion >=0 && calificacion <=3){
     
     System.out.println("Fracaso");

      }else if(calificacion > 3 && calificacion <=5){

      System.out.println("Insuficiente");    

      }else if(calificacion > 5 && calificacion <=8){
      
      System.out.println("Bueno");    

      }else if(calificacion > 9 && calificacion <=10){

      System.out.println("Excelente");  

      }else {
   
      System.out.println("Fuera de rango");
     }
   }
}