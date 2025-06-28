package oo.composicao;

public class Sistema {
    public static void main(String[] args) {

        Compra compra1 = new Compra();
        compra1.adicionarItem("Caneta", 9.67, 100);
        compra1.adicionarItem("Notebook", 2899.89, 2);

        Compra compra2 = new Compra();
        compra2.adicionarItem("Caderno", 19.99, 10);
        compra2.adicionarItem("Impressora", 998.99, 1);
        
        Cliente cliente = new Cliente("Jardel");
        cliente.adicionarCompra(compra1);
        cliente.adicionarCompra(compra2);

        System.out.println("Total das compras do cliente " + cliente.nome + ": R$ " + cliente.obterValorTotal());
    }
}
