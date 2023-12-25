
package herencias3.pkg2021b;

import java.util.Date;

/**
 *
 * @author User
 */
public class HerenciaS32021B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado empleado1 = new Empleado("Juan", 5000.0);
        System.out.println("empleado1 = " + empleado1);
        Cliente cliente1 = new Cliente(new Date(), true, "Karla", 'F', 28,
                "Saturno 15");
        System.out.println("cliente1 = " + cliente1);
    }
}


