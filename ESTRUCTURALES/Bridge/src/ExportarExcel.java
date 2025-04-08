public class ExportarExcel implements Exportador {
    @Override
    public void exportar(String title, String content){
        System.out.println("Exportando EXCEL: " + title + "\nContenido" + content);
    }
}