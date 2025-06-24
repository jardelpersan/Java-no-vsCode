package classes;

public class Usuario {
    String nome;
    String email;

    public boolean equals(Object objeto) {
    
        Usuario outro = (Usuario) objeto;
        return this.nome.equals(outro.nome) && this.email.equals(outro.email);
    }
}
