public class Principal {
    public static void main(String[] args) throws Exception {
        Servicio servicio = new ServicioConLoggin(new ServicioReal());  
        servicio.realizarOperacion();
    }
}
