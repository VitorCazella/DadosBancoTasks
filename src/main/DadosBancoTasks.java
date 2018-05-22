package main;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import model.Aluno;
import tools.DBConnection;
import tools.Menu;

public class DadosBancoTasks {
	
	public static List<String> opsMenuPrincipal = Arrays.asList("Listar Alunos", "Inserir Aluno", "Busca por Matricula");
	
	public static int numMenu = 0;

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
				inserirAluno();
				break;
				
			case 2:
				buscaPorMatric();
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
	
	public static void inserirAluno() {
		Aluno al = new Aluno();
		if(al != null) {
			al.create();
		}
	}
	
	public static void buscaPorMatric() {
		long mat = 0;
		System.out.println("Digite a matricula do aluno: ");
		mat = Menu.scan.nextLong();
		Aluno al = new Aluno(mat);
		al.mostraDados();
	}
	
	public static void limpaTela() {
		System.out.println("\033[2J");

	}

}
