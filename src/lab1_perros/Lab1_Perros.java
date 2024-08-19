/*Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y después se
le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide salir, se mostrará
todos los perros guardados en el ArrayList. Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá un
perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro está en la
lista, se eliminará el perro que ingresó el usuario y se mostrará la lista ordenada. Si el perro no
se encuentra en la lista, se le informará al usuario y se mostrará la lista ordenada. */

package lab1_perros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;


public class Lab1_Perros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
    
       //CREAR LISTA
    ArrayList <String> listaPerros = new ArrayList();
    
    String nombreRaza;
    String respuesta="";
    
    //AGRAGAR PERROS
    do{
            System.out.println("Ingrese raza del perro: ");
            nombreRaza=leer.next();
            
            listaPerros.add(nombreRaza);
            
            System.out.println("¿Quiere ingresar otro perro? (Ingrese si/no)");
            respuesta=leer.next().trim();
            
    }while(respuesta.equalsIgnoreCase("si"));
    
//       if(respuesta.equals("no")){
//                System.out.println("¿Desea salir del programa?");
//                respuesta=leer.next().trim();
//                if(respuesta.equals("no")){
//                    System.out.println("ATENCIÓN! Puede agregar un perro más");
//                    System.out.println("Ingrese raza del perro: ");
//                    nombreRaza=leer.next();
//            
//                    listaPerros.add(nombreRaza);
//                }
//            }
    
    
    //MOSTRAR
        System.out.println("LISTA DE PERROS INGRESADOS:");
        for(String raza: listaPerros){
        System.out.println(raza);
        }
    
    //RECORRER CON ITERATOR
        System.out.println("..........Recorrer con Iterator..........");
        System.out.println("Ingrese la raza de perro a eliminar: ");
        String respuesta2=leer.next();
        
        Iterator<String> it = listaPerros.iterator();
        
        while(it.hasNext()){
            System.out.println(it.next());
        }
    
    //REMOVER ELEMENTO CON ITERATOR
        System.out.println("..............Remover elemento con Iterator................");
        
        Iterator<String> it2 = listaPerros.iterator();
        boolean encontrado= false;
        
        while(it2.hasNext()){
            String perro=it2.next();
            if(perro.equalsIgnoreCase(respuesta2)){
            it2.remove();
            encontrado=true;
            break;
            }
        }
        
        
        //CONFIRMAR RESPUESTA AL USUARIO
        if(encontrado){
            System.out.println("Raza encontrada y eliminada ("+respuesta2+").");
        }else{
            System.out.println("Raza no encontrada.");
        }

        
    //ORDENAR LISTA        
        Collections.sort(listaPerros);
    
    //MOSTRAR LISTA ORDENADA
        System.out.println("..........Lista ordenada..........");
        for(String raza: listaPerros){
        System.out.println(raza);
        }
        
        
            System.out.println("ESTO ES PRUEBA DE GIT");
        
    }

}       
