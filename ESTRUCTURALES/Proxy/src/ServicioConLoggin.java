public class ServicioConLoggin implements Servicio {
    private Servicio servicioReal;

    public ServicioConLoggin(Servicio servicioReal){
        this.servicioReal = servicioReal;
    }

    @Override
    public void realizarOperacion(){
        System.out.println("Inicio de la operacion");
        servicioReal.realizarOperacion();
        System.out.println("Fin de la operacion");
    }
    
}
