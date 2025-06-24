package colecoes;

import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new java.util.LinkedList<String>();
        fila.add("Ana");
        fila.add("Bia");
        fila.add("Carlos");
        fila.offer("Rafael");


        System.out.println(fila.peek());
        System.out.println(fila.poll());
        System.out.println(fila.element());
        
    }

}
