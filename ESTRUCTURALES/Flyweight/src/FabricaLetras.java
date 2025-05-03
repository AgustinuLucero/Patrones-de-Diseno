import java.util.HashMap;
import java.util.Map;
public class FabricaLetras{
    private static Map<Character, Letra> letras = new HashMap<>();

    public static Letra obtenerLetra(char c){
        letras.putIfAbsent(c, new LetraConcreta(c));
        return letras.get(c);
    }
}
