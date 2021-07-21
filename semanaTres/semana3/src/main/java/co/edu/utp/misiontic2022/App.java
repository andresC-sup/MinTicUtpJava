package co.edu.utp.misiontic2022;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ArrayList <Object> lista = new ArrayList<>();
        lista.add(16);
        lista.add("esto es uan cademna");
        lista.add("empanada");
        lista.add(6);
        lista.add(1);
        lista.add(126);

        // GET AND PRINT ELEMENTS OF ARRAYLIST
       for(Object elemento : lista){
            System.out.println(elemento);
        } 


        //CONJUNTOS
        Set <Integer> conjunto = new HashSet<>();
        //Don´t add elemts with the same value
        conjunto.add(3);
        conjunto.add(1);
        conjunto.add(3);

        for(Integer elemento : conjunto){
            System.out.println(elemento);
        }
        //ask an return true or false if the object contain the value
        System.out.println(conjunto.contains(3));
        System.out.println(conjunto.contains(13));
        conjunto.clear();
        conjunto.size();

        //create cola
        Queue <String> cola = new PriorityQueue<>();
        cola.add("Nick");
        cola.add("Tamara");
        cola.add("Calila");
        //Isert element into cola
        cola.offer("Rajish");
        //Head of cola 
        System.out.println(cola.peek());
        //Delete element of cola
        cola.remove("Calila");
        //Print all elements of the cola
        for (String elemento : cola){
            System.out.println(elemento);
        }
        //CREATE MAP
        Map <String, Integer> contenedor = new HashMap();
        //Add values to MAp
        contenedor.put("Diana",33);
        contenedor.put("Clara",25);
        contenedor.put("Raul",63);


    }
}
