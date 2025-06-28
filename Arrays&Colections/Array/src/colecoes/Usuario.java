package colecoes;

public class Usuario {
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Usuario))
            return false;
        Usuario usuario = (Usuario) obj;
        return this.nome.equals(usuario.nome);
    }
    
    //ISSO AQUI EU NÃO ENTENDI
}
