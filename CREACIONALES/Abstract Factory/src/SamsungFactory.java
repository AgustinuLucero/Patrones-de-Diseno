public class SamsungFactory implements ElectrodomesticoFactory{ // Fábrica para crear productos Samsung.
    public Heladera crearHeladera(){ // instancia de heladera Samsung.
        return new SamsungHeladera();
    }

    public Lavarropas crearLavarropas(){ // instancia de lavarropas Samsung.
        return new SamsungLavarropas();
    }
}
