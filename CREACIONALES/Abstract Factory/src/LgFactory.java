public class LgFactory implements ElectrodomesticoFactory{ // Fábrica para crear productos LG.
    public Heladera crearHeladera(){ // instancia de heladera LG.
        return new LgHeladera();
    }
    public Lavarropas crearLavarropas(){ // instancia de lavarropas LG.
        return new LgLavarropas();
    }
}