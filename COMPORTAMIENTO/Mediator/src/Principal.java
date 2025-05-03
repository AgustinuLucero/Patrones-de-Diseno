public class Principal {
    public static void main(String[] args) throws Exception {
        ChatMediator chat = new ChatSimple();

        Usuario agustin = new Usuario("Agustin",chat);
        Usuario francisco = new Usuario("Francisco",chat);
        Usuario pablo = new Usuario("Pablo",chat);

        chat.agregarUsuario(agustin);
        chat.agregarUsuario(francisco);
        chat.agregarUsuario(pablo);

        agustin.enviar("Hola, todo bien?");
        pablo.enviar("Todo bien");

    }
}
