public class DecoratorBebida implements Bebida{
    protected Bebida bebida;

    public DecoratorBebida(Bebida bebida){
        this.bebida = bebida;
    }

    public String getDescripcion(){
        return bebida.getDescripcion();
    }

    public double getCosto(){
        return bebida.getCosto();
    }
}
