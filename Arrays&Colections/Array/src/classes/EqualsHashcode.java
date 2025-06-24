package classes;

public class EqualsHashcode {
    public static void main(String[] args) {
    Usuario usuario1 = new Usuario();
    usuario1.nome = "Pedro Silva";
    usuario1.email = "pedro.silva@email.com";

    Usuario usuario2 = new Usuario();
    usuario2.nome = "Pedro Silva";
    usuario2.email = "pedro.silva@email.com";
    // Verifica se os objetos são iguais
      System.out.println(usuario1.equals(usuario2)); // true
    }
    
}
