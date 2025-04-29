import java.util.List;

public class IteratorAmigos implements Iterator {
    private List<PerfilUsuario> amigos;
    private int posicionActual = 0;

    public IteratorAmigos(List<PerfilUsuario> amigos) {
        this.amigos = amigos;
    }

    public boolean tieneSiguiente() {
        return posicionActual < amigos.size();
    }

    public PerfilUsuario siguiente(){
        return amigos.get(posicionActual++);
    }
}
