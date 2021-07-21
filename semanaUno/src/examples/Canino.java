package examples;
public class Canino {
    //ATRIBUTOS
    String aullar;
    String formaDeAlimento;
    // CONSTRUCTOR
    public Canino(String aullar, String formaDeAlimento){
        this.aullar= aullar;
        this.formaDeAlimento = formaDeAlimento;
    }

    //METIDOS
    public String getAullat(){
        return aullar;
    }
    public String getAullar() {
        return aullar;
    }
    public void setFormaDeAlimento(String formaDeAlimento) {
        this.formaDeAlimento = formaDeAlimento;
    }
    public String getFormaDeAlimento() {
        return formaDeAlimento;
    }

}

