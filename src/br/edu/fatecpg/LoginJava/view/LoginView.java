package br.edu.fatecpg.LoginJava.view;

import java.util.Scanner;

import br.edu.fatecpg.LoginJava.controller.LoginController;

public class LoginView {
	private LoginController loginController;
	private Scanner scanner = new Scanner(System.in);
	
	public void setLoginController(LoginController loginController) {
	    this.loginController = loginController;
	}
	
	public void exibirMensagem(String mensagem) {
		System.out.println(mensagem);
	}

	public String getUsuario() {
		exibirMensagem("Digite o nome de usuário: ");
		return scanner.nextLine();
	}
	
	public String getSenha() {
		exibirMensagem("Digite a senha: ");
		return scanner.nextLine();
	}
	
	public void menuLogado() {
		while (loginController.getLogado()) {
		    try {
		        exibirMensagem("[1] Botão do 'Olá Mundo!'");
		        exibirMensagem("[2] Logout");
		        exibirMensagem("[3] Redefinir dados");
		        exibirMensagem("[4] Sair do programa");
		        exibirMensagem("Digite uma opção: ");
		        String input = scanner.nextLine();

		        int opcao = Integer.parseInt(input);

		        switch (opcao) {
		            case 1:
		                exibirMensagem("Olá Mundo!");
		                break;

		            case 2:
		                loginController.logout();
		                break;

		            case 3:
		                loginController.redefinirDados();
		                break;

		            case 4:
		                exibirMensagem("Saindo...");
		                System.exit(0);
		                break;

		            default:
		                exibirMensagem("Opção inválida!");
		                break;
		        }
		    } catch (NumberFormatException e) {
		        exibirMensagem("Insira um número válido!");
		    } catch (Exception e) {
		        exibirMensagem("Erro! " + e.getMessage());
		    }
		}
	}
}
