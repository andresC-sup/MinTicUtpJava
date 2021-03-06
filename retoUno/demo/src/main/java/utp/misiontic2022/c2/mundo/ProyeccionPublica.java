package utp.misiontic2022.c2.mundo;
public class ProyeccionPublica {
    //ATRIBUTOS
    private int pTiempo;
    double interesCompuesto = 0;
    double interesSimple= 0;
    private double respuesta;
    private double pCapital;
    private double pInteres;
    //METIDOS
    public double getpCapital() {
        return pCapital;
    }
    public void setpCapital(double pCapital) {
        this.pCapital = pCapital;
    }
    public int getpTiempo() {
        return pTiempo;
    }
    public void setpTiempo(int pTiempo) {
        this.pTiempo = pTiempo;
    }
    public double getpInteres() {
        return pInteres;
    }
    public void setpInteres(double pInteres) {
        this.pInteres=pInteres;
    }
    public String inversion(int pTiempo, double pCapital, double pInteres){
        /*CΓ‘lculo de la diferencia entre tipos de tasas*/       
        interesSimple = calcularInteresSimple( pTiempo,  pCapital,  pInteres);
        interesCompuesto =calcularInteresCompuesto( pTiempo,  pCapital,  pInteres) ;
        respuesta =  interesCompuesto - interesSimple; 
        //return "el valor uno fue: "+ interesSimple;
        return "La diferencia en el total de intereses generados para el proyecto, si escogemos entre evaluarlo a una tasa de interΓ©s Compuesto y evaluarlo a una tasa de interΓ©s Simple, asciende a la cifra de: $"+respuesta;
    }   
    public double calcularInteresCompuesto(int pTiempo, double pCapital, double pInteres){
        //πππ‘ππππ πΆππππ’ππ π‘π = ππππ‘π * [( 1 + πππ‘ππππ )^ π‘πππππ - 1] 
        return pCapital * (Math.pow((1 +pInteres), pTiempo)-1);
    }
    public double calcularInteresSimple(int pTiempo, double pCapital, double pInteres){
        //intππππ ππππππ = ππππ‘π * πππ‘ππππ  * π‘πππππ;
        return (pCapital * pInteres * pTiempo);
    }

}
