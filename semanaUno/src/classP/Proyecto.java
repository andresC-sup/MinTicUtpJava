package classP;

public class Proyecto {
    //ATRIBUTOS
    private int codigo;
    private String nombre;
    private int idJefe;
    // CONSTRUCTOR
    public Proyecto(int codigo, String nombre, int idJefe){
        this.codigo = codigo;
        this.nombre = nombre;
        this.idJefe = idJefe;
    }
    //METIDOS
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getIdJefe() {
        return idJefe;
    }
    public void setIdJefe(int idJefe) {
        this.idJefe = idJefe;
    }
}
