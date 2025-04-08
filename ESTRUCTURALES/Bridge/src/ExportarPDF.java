public class ExportarPDF implements Exportador{
    @Override
    public void exportar(String title, String content){
        System.out.println("Exportando PDF: " + title + "\nContenido" + content);
    }
}
