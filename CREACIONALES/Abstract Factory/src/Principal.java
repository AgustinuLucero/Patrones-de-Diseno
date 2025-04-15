public class Principal{
    public static void main(String[] args) throws Exception {
        ElectrodomesticoFactory factorySamsung = new SamsungFactory(); // se crea la fábrica Samsung sin saber los detalles internos.
        //creo los electrodomesticos 
        Heladera heladeraSamsung = factorySamsung.crearHeladera();
        Lavarropas lavarropasSamsung = factorySamsung.crearLavarropas();
        // los uso
        heladeraSamsung.enfriar();
        lavarropasSamsung.lavar();

        ElectrodomesticoFactory factoryLG = new LgFactory(); // se crea la fábrica LG sin saber los detalles internos.
        Heladera heladeraLG = factoryLG.crearHeladera();
        Lavarropas lavarropasLG = factoryLG.crearLavarropas();

        heladeraLG.enfriar();
        lavarropasLG.lavar();
    }
}
