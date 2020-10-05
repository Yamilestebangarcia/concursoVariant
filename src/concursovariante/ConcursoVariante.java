
package concursovariante;

import java.util.Scanner;


public class ConcursoVariante {

   
    public static void main(String[] args) {
         
        String nombre; 
        String apellido1;
        String apellido2;
        int x=2;
        int y=3;
        String resultado;
        Scanner teclado = new Scanner( System.in );
        System.out.println("introduce tu nombre");
        nombre=teclado.next();
         nombre =nombre.toUpperCase().charAt(0) + nombre.substring(1, nombre.length()).toLowerCase();
         
        System.out.println("introduce tu primer apellido");
         apellido1 =teclado.next();
         apellido1 =apellido1.toUpperCase().charAt(0) + apellido1.substring(1,apellido1.length()).toLowerCase();
      
        System.out.println("introduce tu segundo apellido");
         apellido2 =teclado.next(); 
        apellido2 =apellido2.toUpperCase().charAt(0) + apellido2.substring(1,apellido2.length()).toLowerCase();
   
        boolean esPar1= (apellido1.length()%2)==0;
         boolean esPar2= (apellido2.length()%2)==0;
    
    String letraUltima=nombre.substring(nombre.length()-1);
   
       
   
       
           if(letraUltima.equalsIgnoreCase("a") ||letraUltima.equalsIgnoreCase("e") || letraUltima.equalsIgnoreCase("i") || letraUltima.equalsIgnoreCase("o") || letraUltima.equalsIgnoreCase("u")){
         
               if(esPar1==esPar2){
                   System.out.println(nombre+" "+apellido1+" "+apellido2+". Es apta para el concurso");
               }else{ 
                   System.out.println(nombre+" "+apellido1+" "+apellido2+". No apta para el concurso");
               }
               
         }else{
         System.out.println(nombre+" "+apellido1+" "+apellido2+". No apta para el concurso"); 
         }
        
    }
    
}
