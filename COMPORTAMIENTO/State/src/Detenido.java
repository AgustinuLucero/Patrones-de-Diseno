public class Detenido implements Estado{
    @Override
    public void reproducir(Reproductor r) {
        System.out.println("Reproduciendo desde detenido...");
        r.setEstado(new Reproduciendo());
    }
    public void pausar(Reproductor r) {
        System.out.println("No se puede pausar, ya que está detenido.");
        r.setEstado(new Pausado());
    }
    
    public void detener(Reproductor r) {
        System.out.println("Ya está detenido.");
    }
    
}
