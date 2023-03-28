
package clases_propias;

import java.util.GregorianCalendar;

/**
 *
 * @author Jhoel Alexander Narváez Valarezo
 */
public class MetodosGenericos {

    public static void main(String[] args) {
        // Programa ejecutable
        String nombres[]={"jose","Maria","pepe"};
        //String elementos=MisMatrices.getElementos(nombres);
     //   System.out.println(elementos);
  /*      //creamos array de empleados
        Empleado listaEmpleados[] ={new Empleado("Ana", 45, 2500),
            new Empleado("Ana", 45, 2500),
            new Empleado("Ana", 45, 2500),
            new Empleado("Ana", 45, 2500),
            new Empleado("Ana", 45, 2500)
        }; 
        
        System.out.println(MisMatrices.getElementos(listaEmpleados));
       
      Empleado paco = new Empleado("Paco",45, 2500);
      Empleado ana = new Empleado("ana",45, 2500);
      Empleado maria = new Empleado("maria",45, 2500);
      
      Empleado misEmple[]={paco,ana,maria};
      
        System.out.println(MisMatrices.getMenor(misEmple)); */
        GregorianCalendar fechas[]={new GregorianCalendar(2015,07,12),
                                    new GregorianCalendar(2015,07,13),
                                    new GregorianCalendar(2015,07,11)};
  
        System.out.println(MisMatrices.getMenor(fechas));
  
  
    }

}
class MisMatrices{
    public static <T extends  Comparable> T getMenor(T[] a){ 
        if (a ==null || a.length==0) {
            return null;
        }
        T eleMenor=a[0];
        for (int i = 1; i < a.length; i++) {
            if (eleMenor.compareTo(a[i])>0) {
                eleMenor=a[i];
            }
        }
        return eleMenor;
    }
    
}