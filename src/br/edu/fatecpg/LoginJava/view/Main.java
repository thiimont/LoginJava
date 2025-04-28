package br.edu.fatecpg.LoginJava.view;

import br.edu.fatecpg.LoginJava.controller.LoginController;

public class Main {

	public static void main(String[] args) {
        LoginView loginView = new LoginView();
        LoginController loginController = new LoginController(loginView);
        loginView.setLoginController(loginController);
        loginController.iniciarLogin();
	}
	
}
