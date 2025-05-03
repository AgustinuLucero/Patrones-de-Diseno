public class Pausado implements Estado{
    @Override
    public void reproducir(Reproductor r) {
        System.out.println("Reanudando Reproduccion..");
        r.setEstado(new Reproduciendo());
    }
    public void pausar(Reproductor r) {
        System.out.println("Pausada");
    }
    
    public void detener(Reproductor r) {
        System.out.println("Deteniendo desde pausa");
        r.setEstado(new Detenido());
    }
}