public class Rectangulo implements Figura{
    int perimetro;
    String color;

    public Rectangulo(int perimetro, String color) {
        this.perimetro = perimetro;
        this.color = color;
    }

    @Override
    public Rectangulo clonar(){
        return new Rectangulo(this.perimetro, this.color);
    }

    @Override
    public void mostrar() {
        System.out.println("Soy un rectangulo de perimetro " + this.perimetro + " y color " + this.color);
    }

}