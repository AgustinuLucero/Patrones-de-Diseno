// un archivo, clase hoja
public class Archivo implements ElementoSistema{
    private String nombre;

    public Archivo(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void mostrarContenido(String contenido){
        System.out.println(contenido + " " + nombre);
    }
}
