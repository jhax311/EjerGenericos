
package clases_propias;

/**
 * 
 * @author Jhoel Alexander Narváez Valarezo
 */
public class UsoPareja {

        public static void main(String[] args) {
        
            Pareja <String> una= new Pareja <String>() ;
            una.setPrimero("Juan");
            System.out.println(una.getPrimero());
            
            //instacia de persona
            Persona pers1= new Persona("Ana");
            //instancia de clase pareja con tipo persona
            Pareja <Persona> otra = new Pareja <Persona>();
            otra.setPrimero(pers1);
            System.out.println(otra.getPrimero() );
    }
}

class Persona {
    
    private String nombre;
    
    public Persona(String nombre){
        this.nombre=nombre;
    }
    @Override
    public String toString(){
        return nombre;
    }
    
}