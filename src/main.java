
import Controladores.EmpleadosController;
import Modelos.EmpleadosModel;
import Vistas.*;

public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        frmPrincipal VistaPrincipal = new frmPrincipal();
        EmpleadosModel ModeloEmpleados = new EmpleadosModel();
        frmEmpleados VistaEmpleados = new frmEmpleados(VistaPrincipal,true);
        
        EmpleadosController ControladorEmpleados = new EmpleadosController(VistaEmpleados,VistaPrincipal,ModeloEmpleados);
        
    }
    
}
