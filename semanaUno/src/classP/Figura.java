package classP;

public class Figura {
       //ATRIBUTOS
       private int identificadorPlano;
       private int identificador;
       private String nombre;
       private String color;
       private int area;
       private int perimetro;
       private String tipoFigura;
       // CONSTRUCTOR
       public Figura(int identificadorPlano,int identificador,String nombre,String color,int area,int perimetro,String tipoFigura){
        this.identificadorPlano = identificadorPlano;
        this.identificador = identificador;
        this.nombre = nombre;
        this.color = color;
        this.area = area;
        this.perimetro = perimetro;
        this.tipoFigura = tipoFigura;
       }
       //METIDOS
       public int getIdentificadorPlano() {
           return identificadorPlano;
       }
       public void setIdentificadorPlano(int identificadorPlano) {
           this.identificadorPlano = identificadorPlano;
       }
       public int getIdentificador() {
           return identificador;
       }
       public void setIdentificador(int identificador) {
           this.identificador = identificador;
       }
       public String getNombre() {
           return nombre;
       }
       public void setNombre(String nombre) {
           this.nombre = nombre;
       }
       public String getColor() {
           return color;
       }
       public void setColor(String color) {
           this.color = color;
       }
       public int getArea() {
           return area;
       }
       public void setArea(int area) {
           this.area = area;
       }
       public int getPerimetro() {
           return perimetro;
       }
       public void setPerimetro(int perimetro) {
           this.perimetro = perimetro;
       }
       public String getTipoFigura() {
           return tipoFigura;
       }
       public void setTipoFigura(String tipoFigura) {
           this.tipoFigura = tipoFigura;
       }
}
