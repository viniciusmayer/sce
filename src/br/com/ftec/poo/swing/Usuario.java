package br.com.ftec.poo.swing;

public class Usuario {

	private Long id;
	private String email;
	private String senha;
	private boolean selected;

	public Usuario() {
	}

	public Usuario(String email, String senha) {
		this.id = Long.valueOf(((Double) Math.random()).intValue());
		this.email = email;
		this.senha = senha;
	}

	public Usuario(Long id, String email, String senha) {
		this.id = id;
		this.email = email;
		this.senha = senha;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean getSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

}
