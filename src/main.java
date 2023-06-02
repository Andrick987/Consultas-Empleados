
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
        frmConsultas VistaConsultas = new frmConsultas(VistaPrincipal, true);
        frmEmpleados VistaEmpleados = new frmEmpleados(VistaPrincipal,true);
        
        EmpleadosController ControladorEmpleados = new EmpleadosController(VistaEmpleados,VistaConsultas ,VistaPrincipal,ModeloEmpleados);
        
    }//Umg$2023
    
}
