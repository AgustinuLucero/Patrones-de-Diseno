import java.util.ArrayList;
import java.util.List;

public class ChatSimple implements ChatMediator {
    private List<Usuario> usuarios = new ArrayList<>();
    
    @Override
    public void enviarMensaje(String mensaje, Usuario usuarioEmisor){
        for(Usuario u : usuarios){
            // No se envía el mensaje al emisor
            if(u != usuarioEmisor){
                u.recibir(mensaje);
            }
        }
    }

    @Override
    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
}
