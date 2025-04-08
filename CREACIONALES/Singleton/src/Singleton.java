public class Singleton{
    private static Singleton instancia;

    private Singleton(){
        System.out.println("Instancia Creada");
    }

    public static Singleton getInstancia(){
        if(instancia==null){
            instancia = new Singleton();
        }
        return instancia;
    }
}