
package clases_propias;

/**
 * 
 * @author Jhoel Alexander Narváez Valarezo
 */
import java.util.*;
import java.time.*;

public class PruALJhoNar {
    
    public static void main(String[] args) {
        
        LocalDateTime fechaHoraActual = LocalDateTime.now();
        
        ArrayList<Integer> numInt = new ArrayList<>(Arrays.asList(10, 5, 1, 8, 3));
        
        ArrayList<Double> numDou = new ArrayList<>(Arrays.asList(45.2, 5.2, 4.2, 2.3));
        
        ArrayList<String>  names= new ArrayList<>(Arrays.asList("Juan", "Jorge", "Jhoel", "James"));

        
        
       System.out.println("El entero más pequeño es: "+ArrLJhoNar.getMenor(numInt));
       System.out.println("El nombre más pequeño es: "+ArrLJhoNar.getMenor(names));
       System.out.println("El double más pequeño es: "+ArrLJhoNar.getMenor(numDou)+"\n");
       System.out.println("El entero más grande es: "+ArrLJhoNar.getMayor(numInt));
       System.out.println("El nombre más grande es: "+ArrLJhoNar.getMayor(names));
       System.out.println("El double más grande es: "+ArrLJhoNar.getMayor(numDou)+"\n");
        System.out.println(fechaHoraActual);

        }
}
