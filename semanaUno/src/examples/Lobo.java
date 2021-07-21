package examples;
public class Lobo extends Canino{
    private  final boolean  andaEnManada = true;
    private String pelaje;
    Lobo(){
        super("AUUUUUUU","CARNE");
    }
    public void setPenaleje(String pelaje) {
        this.pelaje = pelaje;
    }
    public String getPenaleje() {
        return pelaje;
    }

}
