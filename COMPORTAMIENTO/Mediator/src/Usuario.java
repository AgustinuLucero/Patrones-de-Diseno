public class Usuario{
    private String nombre;
    private ChatMediator chat;

    public Usuario(String nombre, ChatMediator chat){
        this.nombre = nombre;
        this.chat = chat;
    }

    public void enviar(String mensaje){
        System.out.println(this.nombre + " envió: " + mensaje);
        chat.enviarMensaje(mensaje, this);
    }

    public void recibir(String mensaje){
        System.out.println(this.nombre + " recibió: " + mensaje);
    }
}
