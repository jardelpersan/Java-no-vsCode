package oo.abstrato;

public class Cachorro extends Mamifero {
    public Cachorro(String corPelo) {
        super(corPelo);
    }

    @Override
    public String amamentar() {
        return "Cachorro amamentando";
    }

    @Override
    public double mover() {
        return 15.0; // Exemplo de movimento, pode ser ajustado conforme necessário
    }
}
