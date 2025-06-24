package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoComportado {
    public static void main(String[] args) {
        Set<String> lista = new HashSet<String>();
        lista.add("Ana");
        lista.add("Bia");
        lista.add("Carlos");
        lista.add("32");

        for(String candidato: lista) {
            System.out.println(candidato);
        }
    }
}
