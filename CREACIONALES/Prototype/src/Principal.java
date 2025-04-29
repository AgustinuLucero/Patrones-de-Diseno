public class Principal {
    public static void main(String[] args) throws Exception {
        Figura circulo1 = new Circulo(5, "rojo");
        Figura circulo2 = circulo1.clonar();
        Figura rectangulo1 = new Rectangulo(10, "azul");
        Figura rectangulo2 = rectangulo1.clonar();

        circulo1.mostrar();
        circulo2.mostrar();
        rectangulo1.mostrar();
        rectangulo2.mostrar();
    }
}
