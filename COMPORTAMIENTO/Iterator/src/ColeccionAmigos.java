import java.util.ArrayList;
import java.util.List;

public class ColeccionAmigos {
    private List<PerfilUsuario> amigos = new ArrayList<>();

    public void agregarAmigo(PerfilUsuario amigo) {
        amigos.add(amigo);
    }

    public Iterator crearIterador(){
        return new IteratorAmigos(this.amigos);
    }

}
