package br.edu.fatecpg.LoginJava.controller;

import br.edu.fatecpg.LoginJava.model.LoginModel;
import br.edu.fatecpg.LoginJava.view.LoginView;

public class LoginController {
	private LoginModel loginModel = new LoginModel();
	private LoginView loginView;
	private boolean logado = false;
	
	public LoginController(LoginView loginView) {
		this.loginView = loginView;
	}
	
	public void iniciarLogin() {
		while(!getLogado()) {
			String usuario = loginView.getUsuario();
			String senha = loginView.getSenha();
			
			if(loginModel.realizarLogin(usuario, senha)) {
				setLogado(true);
				loginView.exibirMensagem("Bem-vindo, " + usuario);
				loginView.menuLogado();
			} else {
				loginView.exibirMensagem("Usuário e/ou senha incorretos!");
			}
		}
	}
	
	public void logout() {
	    setLogado(false);
		loginView.exibirMensagem("Fazendo logout...");
	}
	
	public void redefinirDados() {
		loginView.exibirMensagem("Insira os novos dados abaixo.");
		String novoUsuario = loginView.getUsuario();
		String novaSenha = loginView.getSenha();
		loginModel.redefinirDados(novoUsuario, novaSenha);
		loginView.exibirMensagem("Usuário e senha redefinidos com sucesso!");
		logout();
	}
	
	public boolean getLogado() {
		return this.logado;
	}
	
	private void setLogado(boolean estado) {
		this.logado = estado;
	}

}
