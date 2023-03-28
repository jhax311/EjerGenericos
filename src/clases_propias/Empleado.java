
package clases_propias;

/**
 * 
 * @author Jhoel Alexander Narváez Valarezo
 */
public class Empleado {
    private String nombre;
    private int edad;
    private double salario;

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }
    public String dameDatos(){
        return "El empleado se llama "+nombre+" tiene "+edad+" y un salario de "+salario;
    }
    
}
