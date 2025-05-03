public class Leche extends DecoratorBebida {
    public Leche(Bebida bebida){
        super(bebida);
    }

    public String getDescripcion(){
        return bebida.getDescripcion() + ", Leche";
    }

    public double getCosto(){
        return bebida.getCosto() + 2.50;
    }
}
