public class Principal {
    public static void main(String[] args) throws Exception {
        //creo la carpeta principal
        Carpeta documentos = new Carpeta("Documentos");
        //archivo normal
        Archivo inscripcion = new Archivo("inscripcion.pdf");
        Archivo planEstudios = new Archivo("Plan de Estudios.xlsx");

        //sub carpeta
        Carpeta Universidad = new Carpeta("Universidad");
        //archivos de la sub carpeta
        Universidad.agregarElemento(new Archivo("Ingenieria de Software.docx"));
        Universidad.agregarElemento(new Archivo("Programacion.docx"));

        documentos.agregarElemento(inscripcion);
        documentos.agregarElemento(planEstudios);
        documentos.agregarElemento(Universidad);
        //llamo al metodo para mostrar el contenido de la carpeta
        documentos.mostrarContenido(" ");
    }
}
