import java.util.ArrayList;
import java.util.List;

public class RedeSocial {

    private List<Usuario> usuarios = new ArrayList<>();

    public RedeSocial(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
}
