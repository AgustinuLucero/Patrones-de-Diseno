public class Usuario implements Subscriber {

    private String name;

    public Usuario (String name){
    this.name   = name;
    } 

    @Override
    public void Update(String NombreDelTitutlo) {
        System.out.println(name + " ha recibido una notificacion: Nuevo video disponible - " + NombreDelTitutlo);
    }   
}
