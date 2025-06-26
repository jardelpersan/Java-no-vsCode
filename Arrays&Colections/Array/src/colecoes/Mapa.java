package colecoes;
import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

public class Mapa {

    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();
        usuarios.put(1, "Ana");
        usuarios.put(2, "Bia");

        System.out.println(usuarios.size()); // Exibe o tamanho do mapa
        System.out.println(usuarios.isEmpty()); // Verifica se o mapa está vazio
        System.out.println(usuarios.get(1)); // Obtém o valor associado à chave
        System.out.println(usuarios.keySet()); // Exibe as chaves do mapa
        System.out.println(usuarios.values()); // Exibe os valores do mapa
        System.out.println(usuarios.containsKey(1)); // Verifica se a chave existe
        System.out.println(usuarios.containsValue("Bia")); // Verifica se o valor existe
        System.out.println(usuarios.entrySet()); // Exibe as entradas (chave-valor) do mapa

        for (int chave : usuarios.keySet()) {
            System.out.println(chave);
        }
    }
}
