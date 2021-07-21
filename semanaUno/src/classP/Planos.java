package classP;

import java.sql.Array;
import java.util.Date;

public class Planos {
    //ATRIBUTOS
    private int codigoIdentificador;
    private Date fechaEntrega;
    private Array arquitectos;
    // CONSTRUCTOR
    public Planos(int codigoIdentificador,Date fechaEntrega, Array arquitectos,int idDibujoPlano){
        this.codigoIdentificador = codigoIdentificador;
        this.fechaEntrega = fechaEntrega;
        this.arquitectos = arquitectos;
    }
    //METIDOS
    public int getCodigoIdentificador() {
        return codigoIdentificador;
    }
    public void setCodigoIdentificador(int codigoIdentificador) {
        this.codigoIdentificador = codigoIdentificador;
    }
    public Date getFechaEntrega() {
        return fechaEntrega;
    }
    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
    public Array getArquitectos() {
        return arquitectos;
    }
    public void setArquitectos(Array arquitectos) {
        this.arquitectos = arquitectos;
    } 
}
