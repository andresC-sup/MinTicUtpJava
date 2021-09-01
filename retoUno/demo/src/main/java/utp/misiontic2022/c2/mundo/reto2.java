class Factura2{
    Dulces[] lista;

    public Factura2(Dulces lista[]){
        this.lista = lista;
    }
    //METHODOS
    public void mostrarTotales(){
        double totalDulces = 0;
        double totalDulcesLocales=0;
        double totalDulcesInternacionales=0;
        for(Dulces dulce: lista){
            double precio = dulce.calcularPrecio();
            totalDulces += precio;
            if(dulce.getClass() == DulceLocal.class){
                totalDulcesLocales += precio;
            } else if(dulce.getClass() == DulceInternacional.class){
                totalDulcesInternacionales += precio;
            }
        } 
        System.out.println("El precio total de los dulces es de "+totalDulces);
        System.out.println("La suma del precio de los DulcesLocales es de "+totalDulcesLocales);
        System.out.println("La suma del precio de los DulcesInternacionales es de "+totalDulcesInternacionales);
        
    }


}

class Dulces {


    private final static String MARCA="Colombina";
    private final static String SABOR="Dulce";
    private final static double PRECIO_BASE=10000;

    private String marca;
    private String sabor;
    private Double precioBase;

    public Dulces(){
        marca=MARCA;
        sabor=SABOR;
        precioBase=PRECIO_BASE;
    }
    public Dulces(String marca){
        this.marca =    marca;
        sabor = SABOR;
        precioBase = PRECIO_BASE;
    }
    public Dulces(String marca,String sabor, double precioBase){
        this.marca =    marca;
        this.sabor = sabor;
        this.precioBase = precioBase;
    }

    public double calcularPrecio(){
        double preciiFinal =  precioBase;
        if (marca.equals("Colombina")){
            preciiFinal = preciiFinal - (preciiFinal * 0.45 );
        }else{
            preciiFinal = preciiFinal - (preciiFinal * 0.15 );
        }

        if(sabor.equals("Dulce")){
            if((preciiFinal - 3500) > 0){
                preciiFinal =  preciiFinal - 3500;
                return preciiFinal;
            }else{
                return preciiFinal;
            }
        }else{
            if((preciiFinal - 1500 ) > 0){
                preciiFinal =  preciiFinal - 1500;
                return preciiFinal;
            }else{
                return preciiFinal;     
            }
        }

    }



}

class DulceLocal extends Dulces{
    private final static String REGION = "valle";
    private String region;

    public DulceLocal(){
        region = REGION;
    }
    public DulceLocal(String region){
        this.region = region;
    }

    public DulceLocal(String marca, String sabor, double precioBase, String region ){
        super(marca,sabor, precioBase);
        this.region = region;
    }

    public double calcularPrecio(){
        double precioFinal= super.calcularPrecio();
        if(region.equals("valle")){
            precioFinal += 10000;
        }
        return precioFinal;
    }
}

class DulceInternacional extends Dulces{
    private final static int PESO = 100;
    private int peso;

    public DulceInternacional(){
        peso = PESO;
    }
    public DulceInternacional(int numero_fichas){
        this.peso = peso;
    }

    public DulceInternacional(String marca, String sabor, double precioBase, int peso ){
        super(marca,sabor, precioBase);
        this.peso = peso;
    }
    
    public double calcularPrecio(){
        double precioFinal= super.calcularPrecio();
        if( peso<50){
            precioFinal += 15000;
        }else{
            precioFinal += 20000;
        }
        return precioFinal;
    }
}