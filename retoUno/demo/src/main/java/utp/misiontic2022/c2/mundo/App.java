package utp.misiontic2022.c2.mundo;


public class App {

    public static void main( String[] args )
    {
        
        ProyeccionPublica resultadoInversion = new ProyeccionPublica();

        System.out.println(resultadoInversion.inversion(12,2000000,5));

        ProyeccionPublica resultadoInversion2 = new ProyeccionPublica();

        System.out.println(resultadoInversion2.inversion(11,2005000.0,4));
    }
 

    /**
    Método para comparar la diferencia en el total de
     * intereses generados para el proyecto.
    * *@return Un mensaje con el valor final del interés*/



}
