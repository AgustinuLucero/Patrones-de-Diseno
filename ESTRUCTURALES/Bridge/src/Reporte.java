abstract class Reporte {
    protected Exportador exportador;

    public Reporte(Exportador exportador) {
        this.exportador = exportador;
    }
    public abstract void generar();    
}