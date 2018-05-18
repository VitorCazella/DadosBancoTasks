package tools;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

	private String nomeMenu = "";
	private List<String> opsMenu = new ArrayList<String>();
	private int opSelecionada = 0;

	public static Scanner scan = new Scanner(System.in);

	public Menu(String n, List<String> ops) {
		this.nomeMenu = n;
		this.opsMenu = ops;

	}

	public void show() {

		System.out.println(nomeMenu);

		for (String string : opsMenu) {
			System.out.println(opsMenu.indexOf(string) + " - " + string);
		}
		System.out.println("99 - Sair");

	}

	public int getOption() {

		System.out.println("Digite a opção desejada para "+nomeMenu+":");

		try {
			opSelecionada = scan.nextInt();
			scan.nextLine();
		} catch (Exception e) {
			System.out.println("Erro de valor! Somente números!");
			scan.nextLine();
		}

		return opSelecionada;
	}

}
