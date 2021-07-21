package examples;
import java.util.Random;

public class App2 {
    
    public static void main(String[] args) throws Exception {
        //aarreglos
        int arreglo [] = new int [3];
        Random rand = new Random();
        //create for 
        for(int i = 0; i < arreglo.length; i++){
            //add values to array
            arreglo[i]= rand.nextInt(10);
            //change value of array if this is 4
            if(arreglo[i] == 4){
                arreglo[i] = 22;
            }  
            //print array ONE BY ONE
            System.out.println(arreglo[i]); 
        }
        
    }
}