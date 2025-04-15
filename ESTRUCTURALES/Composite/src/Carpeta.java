import java.util.ArrayList;
import java.util.List;
// esta clase compuesta puede tener archivos y carpetas
public class Carpeta  implements ElementoSistema{
    private String nombre;

    // lista de elementos dentro de la carpeta
    private List<ElementoSistema> elementos = new ArrayList<>(); 
    
    public Carpeta(String nombre) {
        this.nombre = nombre;
    }

    //metodo para agrear elementos a la carpeta
    public void agregarElemento(ElementoSistema elemento) {
        elementos.add(elemento);
    }

    @Override
    public void mostrarContenido(String contenido) {
        System.out.println(contenido + " " + nombre);
        // se llama al metodo de cada elemento dentro de la carpeta
        for (ElementoSistema elemento : elementos) {
            elemento.mostrarContenido(contenido + "  ");
        }
    }
}
