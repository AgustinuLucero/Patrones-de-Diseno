public class Principal {
    public static void main(String[] args) throws Exception {
        // Crear el reproductor
        Reproductor reproductor = new Reproductor();
        reproductor.reproducir(); // Ya se está reproduciendo
        reproductor.pausar(); // Pausando la reproducción...
        reproductor.reproducir(); // Reproduciendo desde pausado...
        reproductor.detener(); // Deteniendo la reproducción...
    }
}
