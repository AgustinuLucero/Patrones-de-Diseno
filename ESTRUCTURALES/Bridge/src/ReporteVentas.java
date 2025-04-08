//se hereda de la clase Reporte con su respectivo metodo generar()
public class ReporteVentas extends Reporte {

    public ReporteVentas(Exportador exportador) {
        super(exportador);
    }
    
    @Override
    public void generar(){
        String title= "Reporte de ventas";
        String content="Ventas totales del mes: XXXX";
        exportador.exportar(title, content);
    }
}