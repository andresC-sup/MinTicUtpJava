
import java.util.*;

public class App {
    
    public static void main(String[] args) throws Exception {

        
        Scanner scan = new Scanner (System.in);  

        System.out.println("******************************************");
        System.out.println("* 1) Suma Resta Multiplicacion y divicion ");
        System.out.println("* 2) Promedio de tres notas");
        System.out.println("* 3) Calcular el salario del empleado");
        System.out.println("* 4) Tabla de multiplicar de N numero ");
        System.out.println("* 5) Generar numero aleatorio y adivinar");
        System.out.println("* 6) Calcular peso ideal del H y la M");
        System.out.println("* 7) Definir si numero es primo o no es");
        System.out.println("* 8) Juego de piedra papale y tijera");
        System.out.println("* 9) Calcualr salario segun datos");
        System.out.println("* 10) Serie fibonacci hasta numero ingresado");
        System.out.println("******************************************");
        System.out.println("Digite el ejercisio al que quiere ingresar");
        int menu= scan.nextInt();

        switch(menu) {
            case 1:
                ejercisioUno();
              break;
            case 2:
                ejercisioDos();
                break;
            case 3:
                ejercisioTres();
                break;
            case 4:
                ejercisioCuatro();
                break;
            case 5:
                ejercisioCinco();
                break;
            case 6:
                ejercisioSeis();
                break;
            case 7:
                ejercisioSiete();
                break;
            case 8: 
                ejercisioOcho();
                break;
            case 9:    
                 ejercisioNueve();
                break;
            case 10:
                ejercisioDiez();
                break;
            default:
        }
    }

    public static void ejercisioUno(){
        int num,numD;
        Scanner scan = new Scanner (System.in);
        /*1) Realizar la suma, la resta, la división y la multiplicaciónde dos númerosleídos por teclado y mostrar en pantalla 
        “La<operación>de<número 1> y <número 2> es igual a <resultado>”*/
        System.out.println("Digite el primer numero");
        num= scan.nextInt();
        System.out.println("Digite el segundo numero");
        numD= scan.nextInt();

        System.out.println("****************");
        System.out.println("La resta de "+num+" menos "+numD +" es igual a "+(num-numD));
        System.out.println("****************");
        System.out.println("La suma de "+num+" mas "+numD +" es igual a "+(num+numD));
        System.out.println("****************");
        System.out.println("La multiplicacion de "+num+" por "+numD +" es igual a "+(num*numD));
        System.out.println("****************");
        System.out.println("La divicion de "+num+" entre "+numD +" es igual a "+(num/numD));
    }

    public static void ejercisioDos(){
        String nombreUsr;
        double notaU,notaD,notaT,promedio;
        Scanner scan = new Scanner (System.in);  
        ///// PROBLEMA AL INGRESAR DECIMAL
        /*
        2) Realizar un programa que realice el promedio de las notas de un alumno,
        para ello el programa va a tener que solicitar el nombre del alumno y las notas de las 3 evaluaciones. 
        Si el alumno tiene unpromedio mayor o igual a 3.0 también debe imprimir “Aprobado”, 
        si no alcanzóesa nota debe imprimir “Reprobado” .Requisitos: Las notas que se ingresanpueden tenerdecimales
        */ 
        
        System.out.println("Digite el nombre del alumno");
        nombreUsr = scan.next();
        System.out.println("Digite la primea nota ");
        notaU = scan.nextDouble();
        System.out.println("Digite la segunda nota");
        notaD = scan.nextDouble();
        System.out.println("Digite la ultima nota");
        notaT = scan.nextDouble();
        promedio = (notaU+notaD+notaT)/3;

        if(promedio >= 3.0){
             System.out.println("El estudiante " + nombreUsr + " Aprobado con un promedio de " + promedio);
        }else{
             System.out.println("El estudiante " + nombreUsr + " Reprobado con un promedio de " + promedio);
        }
    }

    public static void ejercisioTres(){
        int horasT;
        Scanner scan = new Scanner (System.in);
        /* 3)Realizar un programa que calcule el sueldo de un trabajador,
        el programa solicita el número de horas que has trabajado en un mes, las horas sepagan a $30.000.
        */
        System.out.println("Digite la cantidad de horas trabajadas");
        horasT= scan.nextInt();
        System.out.println("El sueldo a deengar es de: $"+String.format("%,d", horasT*30000) );
    }

    public static void ejercisioCuatro(){
        int umeriTabla;
        Scanner scan = new Scanner (System.in);
        /* 4) Solicitar un número al usuario y mostrar la tabla de multiplicar de ese número, 
        desde el 0 hasta el 10.Truco: Usa un bucle for para recorrer la tabla y mostrar los datos
        */
        System.out.println("Digite a tabla que quiere imprimir");
        umeriTabla= scan.nextInt(); 
        for(int i = 0; i <= 10; i++){
            System.out.println(i + " * " + umeriTabla + " = " + (i*umeriTabla));
        }     
    }

    public static void ejercisioCinco(){
        int min = 1,max = 100,value,numSecreto;
        Random random = new Random();
        boolean centinela = true;
        Scanner scan = new Scanner (System.in);
        /*
        5) Generar un número aleatorio entre el 1 y el 100, el usuario lo tiene quea divinar introduciendo el número por teclado.
        En el caso que el número a adivinar sea mayor al ingresado, decirle al usuario “El número que busca es mayor”, de lo contrario, 
        “El número que busca es menor”.El programafinalizará cuando se introduzca el número correcto.
        Nota: usar la claseRandom para generar el número aleatorio*/  
        value = random.nextInt(max + min) + min;
        System.out.println(value);
        do {
            System.out.println("Digite el numero que cree que se genero");
            numSecreto = scan.nextInt();

            if( numSecreto < value ){
                centinela = true;
                System.out.println("El numero ingresado es menor al ingresado ");
            }else if (numSecreto > value) {
                centinela = true;
                System.out.println("El numero ingresado es mayor al ingresado ");
            } else if (numSecreto == value){
                centinela = false;
                System.out.println("igual  ");
            }
        } while( centinela );
    }

    public static void ejercisioSeis(){
        int peso,altura;
        char gh='H',gm='M';
        Scanner scan = new Scanner (System.in);
        /* 6) Realiza un programa que solicite el sexo (H/M) y laaltura (cm) al usuario yque calcule el peso ideal.
        peso ideal mujeres = altura - 120 ///// peso ideal hombres = altura - 110*/                   
        System.out.println("Digite el genero H o M");
        char genero = scan.next().charAt(0);
        System.out.println("Digite la altura ");
        altura = scan.nextInt();

        if(genero == gh){
            peso = altura - 110;
            System.out.println("Su poso ideal es: "+ peso);
        }else if (genero == gm){
            peso = altura - 120;
            System.out.println("Su poso ideal es: "+ peso);
        }else{
            System.out.println("El genero ingresado no esta entre las posibilidades: "+ genero);
        }
    }

    public static void ejercisioSiete(){
        int numSecreto;
        boolean ciclo = true;
        Scanner scan = new Scanner (System.in);
        /* 7) Pedir un número, comprobar si es primo y preguntar si quiere introducir más (S/N) y volver a pensar. */
        do {
            System.out.println("Digite el numero que cree que se genero");
            numSecreto = scan.nextInt();
            if (numSecreto % 2 == 0){
                System.out.println("El numero "+ numSecreto+" es primo");   
            }else{
                System.out.println("El numero "+ numSecreto+" no es primo");   
            }

            System.out.println("Desea preguntar por otro numero 1 si 0 no");
            numSecreto = scan.nextInt();

            if( numSecreto == 1 ){
                ciclo = true;
            } else if (numSecreto == 0){
                ciclo = false;
            }
        } while( ciclo );
    }

    public static void ejercisioOcho(){
        char ju,jd;
        Scanner scan = new Scanner (System.in);
        /*
        8) Realizar un programa que permita controlar el juegode piedra, papel, tijeraintroduciendo P para piedra, 
        L para papel y T paratijera por cada jugador. El sistema debe indicar qué jugador gana la ronda o si hay empate. 
        Al finalde cada ronda preguntar si desea volver a jugar
        */ 

        System.out.println("!! Recuerde P para piedra, L para papel y T paratijera");
        System.out.println("Primer jugador digite su opcion");
        ju = scan.next().charAt(0);
        System.out.println("Segundo jugador digite su opcion");
        jd = scan.next().charAt(0);

        if(ju == 'P'){
            if(jd == 'L'){
                System.out.println("El segundo jugar GANA"); 
            }else{
                System.out.println("El Primer jugar GANA"); 
            }
        }else if (ju == 'L'){
            if(jd == 'T'){
                System.out.println("El segundo jugar GANA"); 
            }else{
                System.out.println("El Primer jugar GANA"); 
            }
        }else if (ju == 'T'){
            if(jd == 'P'){
                System.out.println("El segundo jugar GANA"); 
            }else{
                System.out.println("El Primer jugar GANA"); 
            }
        }
    }

    public static void ejercisioNueve(){

        String nombre;
        int salario,edad,porcentaje;
        Scanner scan = new Scanner (System.in);
        /* 9) identifcar el aumento salarial sependiendo de la edad */   
        System.out.println("Digite el nombre del usuario");
        nombre = scan.next();
        System.out.println("Digite la edad");
        edad = scan.nextInt();
        System.out.println("Digite el salario");
        salario = scan.nextInt();

        if(edad <= 16){
            System.out.println("El usuario "+ nombre+ "No tiene permiso para trabajar");   
        }else if (edad >= 19 & edad <=50){
            porcentaje = ((5 * salario) / 100);
        }else if (edad >= 51 & edad <= 60){
            porcentaje = ((10 * salario) / 100);
        }else if (edad > 60 ){
            porcentaje = ((15 * salario) / 100);
        }

        salario = salario + porcentaje;
        System.out.println("El salario final para "+nombre+" es de: "+salario); 
    }

    public static void ejercisioDiez(){
        int a = 0, b = 1,restriccion,suma=1;
        Scanner scan = new Scanner (System.in);
        /* 10) FIBONACHI*/
        System.out.println("Digite limite");
        restriccion = scan.nextInt();
        
        System.out.println(a);
        
        for (int i = 1; suma < restriccion; i++) {
            System.out.println(suma);
            suma = a + b;
            a = b;
            b = suma;    
        }
    }
    
}



