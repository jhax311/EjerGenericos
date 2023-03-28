
package clases_propias;

/**
 * 
 * @author Jhoel Alexander Narváez Valarezo
 * @param <T>
 */
public class Pareja<T> {
    
    private T primero ;
    
    public Pareja(){
        primero=null;
    }

    public void setPrimero(T newPrim) {
        this.primero = newPrim;
    }

    public static void impTraba(Pareja<? extends Empleado> p){
        Empleado primero= p.getPrimero();
        System.out.println(primero);
    }
    public T getPrimero() {
        return primero;
    }
    
    
}
