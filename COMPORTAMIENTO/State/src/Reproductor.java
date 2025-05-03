public class Reproductor {
    private Estado estado;

    public Reproductor() {
        this.estado = new Reproduciendo();
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void reproducir() {
        estado.reproducir(this);
    }
    public void pausar() {
        estado.pausar(this);
    }
    public void detener() {
        estado.detener(this);
    }
}
