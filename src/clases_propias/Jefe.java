
package clases_propias;

/**
 * 
 * @author Jhoel Alexander Narv�ez Valarezo
 */
public class Jefe extends Empleado{

    public Jefe(String nombre, int edad, double salario) {
        super(nombre, edad, salario);
    }
    double incentivo(double inc){
        return inc;
    }
}
