public class Principal {
    public static void main(String[] args) throws Exception {
        Casa Micasa = new Casa.Builder()
                .garage(true)
                .habitaciones(3)
                .patio(false)
                .puertas(3)
                .tipoTecho("madera")
                .Ventanas(6)
                .build();
        Micasa.mostrarCasa();
    }
}

