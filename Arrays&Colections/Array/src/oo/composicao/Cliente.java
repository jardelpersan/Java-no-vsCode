package oo.composicao;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    final String nome;
    final List<Compra> compras = new ArrayList<>();

    Cliente(String nome) {
        this.nome = nome;
    }
    // Adiciona uma compra ao cliente
    void adicionarCompra(Compra compra) {
        this.compras.add(compra);
    }
    double obterValorTotal() {
        double total = 0;
        for (Compra compra : compras) {
            total += compra.obterValorTotal();
        }
        return total;
    }
}
