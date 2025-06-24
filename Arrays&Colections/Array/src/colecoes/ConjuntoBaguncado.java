package colecoes;

import java.util.HashSet;

public class ConjuntoBaguncado {
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();

        conjunto.add(1.2);
        conjunto.add("Teste");
        conjunto.add(true);
        conjunto.add(1); // Autoboxing de int para Integer
        conjunto.add(1); // Não será adicionado novamente, pois já existe

        System.out.println(conjunto.size()); // Exibe o tamanho do conjunto
        System.out.println(conjunto.contains("Teste")); // Verifica se o conjunto contém "Teste"
        System.out.println(conjunto.contains(2)); // Verifica se o conjunto contém 2    


        HashSet nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        conjunto.addAll(nums); // Adiciona todos os elementos do conjunto nums
        System.out.println(conjunto); // Exibe o tamanho do conjunto após adicionar nums
    }
}
