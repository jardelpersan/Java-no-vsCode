package oo.abstrato;

public class Mamifero extends Animal {
    private String corPelo;

    public Mamifero(String corPelo) {
        this.corPelo = corPelo;
    }

    public String amamentar();

    @Override
    public double mover() {
        return 10.0; // Exemplo de movimento, pode ser ajustado conforme necessário
    }

    public String getCorPelo() {
        return corPelo;
    }

}
