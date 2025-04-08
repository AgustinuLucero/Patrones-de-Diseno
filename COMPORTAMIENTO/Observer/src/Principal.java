public class Principal {
    public static void main(String[] args) throws Exception {
        CanalYoutube channel = new CanalYoutube("TechReviews");
        
        Usuario user1 = new Usuario("Juan");
        Usuario user2 = new Usuario("Maria");
        Usuario user3 = new Usuario("Carlos");

        channel.subscribe(user1);
        channel.subscribe(user2);
        channel.subscribe(user3);

        channel.uploadVideo("Review del nuevo iPhone 15");

        channel.unsubscribe(user2);

        channel.uploadVideo("Comparacion de laptops 2025");
    }
}
