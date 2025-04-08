//se hereda de la clase Reporte con su respectivo metodo generar()
public class ReporteFinanciero extends Reporte {

    public ReporteFinanciero(Exportador exportador) {
        super(exportador);
    }
    
    @Override
    public void generar(){
        String title= "Reporte Financiero";
        String content= "Ingresos: $XXX, Egresos: $XXX";
        exportador.exportar(title, content);
    }
}