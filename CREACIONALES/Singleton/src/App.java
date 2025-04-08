public class App {
    public static void main(String[] args) throws Exception {
        Singleton a = Singleton.getInstancia();
        Singleton b = Singleton.getInstancia();

        System.out.println(a == b);
    }
}
