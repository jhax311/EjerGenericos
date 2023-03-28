

package clases_propias;

/**
 *
 * @author Jhoel Alexander Narváez Valarezo
 */
public class HerenciaGenericos {

    public static void main(String[] args) {
        // Programa ejecutable
        //Empleado Admin= new Empleado("Elena", 45, 1500);
        // Jefe direComer= new Jefe("Ana", 27, 3500);
        //Empleado newEmple= direComer;
        
        Pareja<Empleado> Adminis= new Pareja<Empleado>();
        Pareja<Jefe> direComer= new Pareja<Jefe>();
        
        Pareja.impTraba(Adminis);
        Pareja.impTraba(direComer);
        
        
    }

}
