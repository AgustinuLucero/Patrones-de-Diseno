//este generador de reportes genera reportes financieros
//o de ventas en formatos pdf o excel

/* Vamos a tener una interface Exportador que se implementara en las
clases ExportarPDF y ExportarExcel
-------------------------------------
Vamos a tener una clase reporte que hereda sus metodos a
ReporteFInanciero y ReporteVentas */

public class Principal {
    public static void main(String[] args) throws Exception {
        Reporte rep1 = new ReporteFinanciero(new ExportarPDF());
        rep1.generar();
        
        Reporte rep2 = new ReporteVentas(new ExportarExcel());
        rep2.generar();
    }
}