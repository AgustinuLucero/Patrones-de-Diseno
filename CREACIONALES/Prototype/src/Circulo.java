public class Circulo implements Figura {
    int radio;
    String color;

    public Circulo(int radio,String color) {
        this.radio = radio;
        this.color = color;
    }

    @Override
    public Circulo clonar(){
        return new Circulo(this.radio,this.color);
    }

    @Override
    public void mostrar(){
        System.out.println("Soy un circulo de radio " + this.radio + " y color " + this.color);
    }
}
