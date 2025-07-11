package oo.polimorfismo;

public class Jantar {
    public static void main(String[] args) {
        Pessoa convidado = new Pessoa(99.65);

        Arroz ingrediente1 = new Arroz(0.25);
        Feijao ingrediente2 = new Feijao(0.15);
        Sorvete sobremesa = new Sorvete(0.2);

        System.out.println("Peso antes da refeição: " + convidado.getPeso() + " kg");

        convidado.comer(ingrediente1);
        convidado.comer(ingrediente2);

        System.out.println("Peso após a refeição: " + convidado.getPeso() + " kg");

        convidado.comer(sobremesa);
        convidado.comer(sobremesa);

        System.out.println("Peso após a sobremesa: " + convidado.getPeso() + " kg");
    }
}
