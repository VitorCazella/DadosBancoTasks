package main;

import java.sql.Connection;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import tools.DBConnection;
import tools.Menu;

public class DadosBancoTasks {
	
	public static List<String> opsMenuPrincipal = Arrays.asList("Listar Alunos", "Inserir Aluno");
	
	public static int numMenu = 0;
	private static Connection conn = null;

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		Menu menu = new Menu("Menu de Alunos", opsMenuPrincipal);
		menu.show();
		int op = menu.getOption();
		do{
			switch (op) {
			case 0:
				listarAlunos();
				break;
				
			case 1:
				break;
				
			default:
				break;
			}
			menu.show();
			op = menu.getOption();
		} while(op != 99);
		
	
	}

	public static void listarAlunos() {
		DBConnection conn = new DBConnection();
		conn.executeSQL("select a.nome, a.email, a.datanasci from Alunos a");
	}
	
	public static void limpaTela() {
		System.out.println("\033[2J");

	}

}
