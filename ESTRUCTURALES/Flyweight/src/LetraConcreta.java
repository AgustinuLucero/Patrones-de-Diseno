public class LetraConcreta implements Letra {
    private char caracter;
    public LetraConcreta(char caracter) {
        this.caracter = caracter;
    }
    @Override
    public void mostrar(int posicion,String color){
        System.out.println("Letra: " + caracter + " en posicion: " + posicion + " con color: " + color);
    }
}
