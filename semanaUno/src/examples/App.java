package examples;
import javax.swing.JOptionPane;

public class App {
    
    public static void main(String[] args) throws Exception {
        Perro perro1 = new Perro("Pepe Perro",12,"Parado",true);
        System.out.println(perro1.getNombre());
        System.out.println(perro1.getEdad());
        JOptionPane.showMessageDialog(null, perro1.getNombre(), "Mensaje del sistema", JOptionPane.ERROR_MESSAGE);
    }
}



