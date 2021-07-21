package classP;
import java.sql.Array;

public class Poligono {
    //ATRIBUTOS
    private int lineas;
    private Array x;
    private Array y;
    // CONSTRUCTOR
    public Poligono(int lineas, Array x, Array y){
        this.lineas = lineas;
        this.x = x;
        this.y = y;
    }
    //METIDOS
    public int getLineas() {
        return lineas;
    }
    public void setLineas(int lineas) {
        this.lineas = lineas;
    }
    public Array getX() {
        return x;
    }
    public void setX(Array x) {
        this.x = x;
    }
    public Array getY() {
        return y;
    }
    public void setY(Array y) {
        this.y = y;
    }
    public void distancia(int x, int y){
        System.out.println("operacion");
    }
}
