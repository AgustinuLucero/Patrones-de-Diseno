public class BridgeGeneradorReportes {

    public static void main(String[] args) {
        Reporte rep1 = new ReporteFinanciero(new ExportarPDF());
        rep1.generar();
        
        Reporte rep2 = new ReporteVentas(new ExportarExcel());
        rep2.generar();
    }
}