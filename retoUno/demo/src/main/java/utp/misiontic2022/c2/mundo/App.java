package utp.misiontic2022.c2.mundo;


public class App {

    public static void main( String[] args )
    {
        
        Alimentos listaAlimentos2[] = new Alimentos[10];
        listaAlimentos2[0] = new Alimentos(62.8,56,'N');
        listaAlimentos2[1] = new Alimentos(23.5,16,'I');
        listaAlimentos2[2] = new Cereales(212.0,90,'N');
        listaAlimentos2[3] = new Lacteos(60.6,90,2);
        listaAlimentos2[4] = new Cereales(60.0,6);
        listaAlimentos2[5] = new Lacteos();
        listaAlimentos2[6] = new Lacteos(87.2,240,11);
        listaAlimentos2[7] = new Cereales(343.1,140,'N');
        listaAlimentos2[8] = new Lacteos();
        listaAlimentos2[9] = new Lacteos(80.0,40,1);
       
        PrecioTotal solucion2 = new PrecioTotal(listaAlimentos2);
        solucion2.mostrarTotales();
    }
 

    /**
    Método para comparar la diferencia en el total de
     * intereses generados para el proyecto.
    * *@return Un mensaje con el valor final del interés*/



}
