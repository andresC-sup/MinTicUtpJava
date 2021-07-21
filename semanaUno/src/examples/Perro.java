package examples;
public class Perro extends Canino {
    //ATRIBUTOS
    private boolean perseguirCola = true;
    private String orinar;
    private String nombre;
    private int edad;
    // CONSTRUCTOR
    public Perro(String nombre, int edad, String orinar, boolean perseguirCola){
        super("Guaw","DE totod");
        this.nombre = nombre;
        this.edad = edad;
        this.orinar = orinar;
        this.perseguirCola = perseguirCola; 
    }
    //METIDOS
    //*****SECCION NOMBRE
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    //****SECCION ORINAR
    public String getOrinar() {
        return orinar;
    }
    public void setOrinar(String orinar) {
        this.orinar = orinar;
    }
    //****SECCINON PERSEGUIR COLA
    public boolean isPerseguirCola() {
        return perseguirCola;
    }
    public void setPerseguirCola(boolean perseguirCola) {
        this.perseguirCola = perseguirCola;
    }
    //*****EDAD 
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }
}
