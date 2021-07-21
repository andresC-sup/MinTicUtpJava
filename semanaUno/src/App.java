import javax.swing.JOptionPane;
import classP.Jefe;
//import classP.Proyecto;
//import classP.Figura;
//import classP.Planos;

public class App {
    
    public static void main(String[] args) throws Exception {
        Jefe jefe = new Jefe(1,"Raul","Calle 123",1234567);
        JOptionPane.showMessageDialog(null, "El nombre del jefe es: "+jefe.getNombre(), "Informacion del Jefe", JOptionPane.INFORMATION_MESSAGE);
    }
}
