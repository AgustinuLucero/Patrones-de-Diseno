public class Principal {
    public static void main(String[] args) throws Exception {
        String texto = "ababa";
        int posicion = 0;

        for(char c: texto.toCharArray()){
            Letra letra = FabricaLetras.obtenerLetra(c);
            String color = "azul"; //color por defecto
            letra.mostrar(posicion, color);
            posicion++;
        }
        
    }
}
