package br.com.ftec.poo.swing;

import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {

    private static UsuarioDAO usuarioDAO;
    private List<Usuario> usuarios;

    private UsuarioDAO() {
        this.usuarios = new ArrayList<>();
        for (int i = 0; i < 10; i += 1) {
            Usuario usuario = new Usuario(Long.valueOf(i), "usuario " + i, "senha" + i * 3);
            this.usuarios.add(usuario);
        }
    }

    public static UsuarioDAO getInstance() {
        if (usuarioDAO == null) {
            usuarioDAO = new UsuarioDAO();
        }
        return usuarioDAO;
    }

    public List<Usuario> getUsuarios() {
        return this.usuarios;
    }
    
    public void add(Usuario usuario){
        this.usuarios.add(usuario);
    }

	public void deletar() {
		List<Usuario> deletar = new ArrayList<>();
		for (Usuario usuario : this.usuarios) {
			if (usuario.getSelected()){
				deletar.add(usuario);
			}
		}
		this.usuarios.removeAll(deletar);
	}
}