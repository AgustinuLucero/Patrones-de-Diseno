// Adaptador que convierte la interfaz de EnchufeEuropeo a EnchufeAmericano
class AdaptadorEuropeoAmericano implements EnchufeAmericano {
    private EnchufeEuropeo enchufeEuropeo;

    public AdaptadorEuropeoAmericano(EnchufeEuropeo enchufeEuropeo) {
        this.enchufeEuropeo = enchufeEuropeo;
    }

    @Override
    public void conectarEnchufePlano() {
        // Adaptamos la llamada al método del enchufe europeo
        enchufeEuropeo.conectarEnchufeRedondo();
    }
}
