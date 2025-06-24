package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;
// Pilha (Stack) é uma estrutura de dados que segue o princípio LIFO (Last In, First Out).

public class Pilha {
    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<>();

        livros.add("O Pequeno Príncipe"); // Adiciona um livro no topo da pilha
        livros.push("Dom Quixote"); // Adiciona outro livro no topo da pilha
        livros.push("O Senhor dos Anéis");
        System.out.println("Pilha de livros: " + livros);
        System.out.println(livros.peek()); // Exibe o livro do topo da pilha sem removê-lo
        

    }
}
