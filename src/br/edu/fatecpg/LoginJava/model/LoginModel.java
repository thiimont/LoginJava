package br.edu.fatecpg.LoginJava.model;

public class LoginModel {
	private String usuarioPadrao = "admin";
	private String senhaPadrao = "fatec2025";
	
	public boolean realizarLogin(String usuario, String senha) {
		return usuario.equals(getUsuarioPadrao()) && senha.equals(getSenhaPadrao());
	}
	
	private String getUsuarioPadrao() {
		return this.usuarioPadrao;
	}
	
	private String getSenhaPadrao() {
		return this.senhaPadrao;
	}
	
	public void redefinirDados(String novoUsuario, String novaSenha) {
        if (novoUsuario == null || novoUsuario.isEmpty()) {
            throw new IllegalArgumentException("O usuário não pode ser vazio.");
        }
        if (novaSenha == null || novaSenha.length() < 8) {
            throw new IllegalArgumentException("A senha deve ter no mínimo 8 caracteres.");
        }

        this.usuarioPadrao = novoUsuario;
        this.senhaPadrao = novaSenha;
    }

}
