import java.util.Map;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) throws Exception {
        Map<String, String> cookies = new TreeMap<>();

        // Adicionando chaves,valores na coleção
        cookies.put("username", "Vitonga005");
        cookies.put("email", "amaralvitor580@gmail.com");
        cookies.put("phone", "31999310105");

        // Removendo chave
        cookies.remove("email");

        // Alguns metodos
        System.out.println("Cookies contains 'phone': " + cookies.containsKey("phone")); // Saida esperada: true
        System.out.println("Username: " + cookies.get("username")); // Saida esperada: Vitonga005
        System.out.println("Email: " + cookies.get("email")); // Saida esperada: null
        System.out.println("Cookies size: " + cookies.size()); // Saida esperada: 2

        System.out.println();// Pulando uma linha
        System.out.println("ALL COOKIES: ");
        for (String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }

    }
}
