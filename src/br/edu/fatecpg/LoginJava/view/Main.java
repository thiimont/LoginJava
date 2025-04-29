package br.edu.fatecpg.LoginJava.view;

import br.edu.fatecpg.LoginJava.controller.LoginController;
import br.edu.fatecpg.LoginJava.model.LoginModel;

public class Main {

	public static void main(String[] args) {
        LoginView loginView = new LoginView();
        LoginModel loginModel = new LoginModel();
        LoginController loginController = new LoginController(loginView, loginModel);
        loginView.setLoginController(loginController);
        loginController.iniciarLogin();
	}
	
}
