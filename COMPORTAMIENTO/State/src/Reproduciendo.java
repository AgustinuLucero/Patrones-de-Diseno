public class Reproduciendo implements Estado{
   
    @Override
    public void reproducir(Reproductor r) {
        System.out.println("Ya se está reproduciendo");

    }
    public void pausar(Reproductor r) {
        System.out.println("Pausando la reproducción...");
        r.setEstado(new Pausado());
    }
    
    public void detener(Reproductor r) {
        System.out.println("Deteniendo la reproducción...");
        r.setEstado(new Detenido());
    }
}
