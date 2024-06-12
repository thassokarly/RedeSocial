import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Usuario {

    private int usuarioID;
    private String nomeDeUsuario;
    private List<String> amigos;
    private List<String> postagem;

    public Usuario(int usuarioID, String nomeDeUsuario) {
        this.usuarioID = usuarioID;
        this.nomeDeUsuario = nomeDeUsuario;
        this.amigos = new ArrayList<>();
        this.postagem = new ArrayList<>();
    }

    public Usuario() {
    }

    public void adicionarAmigoPeloNome(String amigo){
        //atualizar para adicionar com o nome
        this.amigos.add(amigo);
    }
    public void removerAmigoPeloNome(String amigo){
        //atualizar para remover pelo nome
        this.amigos.remove(amigo);
    }
    public void adicionarPostagem(String postagem){
        this.postagem.add(postagem);
    }

    public void removerPostagem(String postagem){
        this.postagem.remove(postagem);
    }

    public int getUsuarioID() {
        return usuarioID;
    }

    public String getNomeDeUsuario() {
        return nomeDeUsuario;
    }

    public List<String> getAmigos() {
        return amigos;
    }

    public List<String> getPostagem() {
        return postagem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return usuarioID == usuario.usuarioID;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(usuarioID);
    }
}
