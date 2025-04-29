public class ComputadoraFacade {
    private Bios bios;
    private DiscoDuro disco;
    private SistemaOperativo so;

    public ComputadoraFacade() {
        this.bios = new Bios();
        this.disco = new DiscoDuro();
        this.so = new SistemaOperativo();
    }

    public void iniciarComputadora() {
        System.out.println("Iniciando computadora...");
        bios.inicializar();
        disco.cargar();
        so.iniciar();
        System.out.println("Computadora iniciada con éxito.");
    }
}
