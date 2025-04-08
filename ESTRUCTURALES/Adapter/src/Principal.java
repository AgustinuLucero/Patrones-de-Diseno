public class Principal {
    public static void main(String[] args) throws Exception {
        // Enchufe europeo existente
        EnchufeEuropeo enchufeEuropeo = new EnchufeEuropeo();

        // Adaptador para usar el enchufe europeo como si fuera americano
        EnchufeAmericano adaptador = new AdaptadorEuropeoAmericano(enchufeEuropeo);

        // El cliente usa el enchufe americano (a través del adaptador)
        adaptador.conectarEnchufePlano();
    }
}

