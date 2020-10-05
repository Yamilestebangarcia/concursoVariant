
package concursovariante;

import java.util.Scanner;


public class ConcursoVariante {

   
    public static void main(String[] args) {
         //variables entrada
        String nombre; 
        String apellido1;
        String apellido2;
       //entrada de datos
        Scanner teclado = new Scanner( System.in );//instancio la calse scanner
        System.out.println("introduce tu nombre");// imprimo en pantalla
        nombre=teclado.next();//recojo los datos
         nombre =nombre.toUpperCase().charAt(0) + nombre.substring(1, nombre.length()).toLowerCase();// primer obtengo la primera palaba en mayuscula y luego la primera letra de la palabra y la junto
         
        System.out.println("introduce tu primer apellido");// imprimo en pantalla
         apellido1 =teclado.next();//recojo los datos
         apellido1 =apellido1.toUpperCase().charAt(0) + apellido1.substring(1,apellido1.length()).toLowerCase();// primer obtengo la primera palaba en mayuscula y luego la primera letra de la palabra y la junto
      
        System.out.println("introduce tu segundo apellido"); // imprimo en pantalla
         apellido2 =teclado.next(); //recojo los dato
        apellido2 =apellido2.toUpperCase().charAt(0) + apellido2.substring(1,apellido2.length()).toLowerCase();// primer obtengo la primera palaba en mayuscula y luego la primera letra de la palabra y la junto
   
        boolean esPar1= (apellido1.length()%2)==0;//compruebo si es pao o impar
         boolean esPar2= (apellido2.length()%2)==0;//compruebo si es pao o impar
    
    String letraUltima=nombre.substring(nombre.length()-1); //obtengo la ultima letra. 
   
       
   
       //compruebo si la ultima letra tiene vocales
           if(letraUltima.equalsIgnoreCase("a") ||letraUltima.equalsIgnoreCase("e") || letraUltima.equalsIgnoreCase("i") || letraUltima.equalsIgnoreCase("o") || letraUltima.equalsIgnoreCase("u")){
         // compruebo si ambas son pares o impares.
               if(esPar1==esPar2){
                   System.out.println(nombre+" "+apellido1+" "+apellido2+". Es apta para el concurso"); // imprimo en pantalla
               }else{ 
                   System.out.println(nombre+" "+apellido1+" "+apellido2+". No apta para el concurso"); // imprimo en pantalla
               }
               
         }else{
         System.out.println(nombre+" "+apellido1+" "+apellido2+". No apta para el concurso");  // imprimo en pantalla
         }
        
    }
    
}
