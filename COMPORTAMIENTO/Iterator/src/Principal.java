public class Principal {
    public static void main(String[] args) throws Exception {
        ColeccionAmigos misAmigos = new ColeccionAmigos();
        misAmigos.agregarAmigo(new PerfilUsuario("Facundo"));
        misAmigos.agregarAmigo(new PerfilUsuario("Martina"));
        misAmigos.agregarAmigo(new PerfilUsuario("Lucas"));

        Iterator iterador = misAmigos.crearIterador();
        System.out.println("Lista de amigos:");
        
        while (iterador.tieneSiguiente()) {
            PerfilUsuario amigo = iterador.siguiente();
            System.out.println("- " + amigo.getNombre());
        }
        
    }
}
