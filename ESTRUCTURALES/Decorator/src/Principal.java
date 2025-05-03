public class Principal {
    public static void main(String[] args) throws Exception {
        Bebida miBebida = new Cafe();
        miBebida = new Leche(miBebida);
        System.out.println("Descripción: " + miBebida.getDescripcion());
        System.out.println("Costo: " + miBebida.getCosto());
    }
}
