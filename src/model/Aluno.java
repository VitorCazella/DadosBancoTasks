package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.InputMismatchException;

import main.DadosBancoTasks;
import tools.DBConnection;

public class Aluno {

	private int idAluno = 0;
	private String nomeAluno = "";
	private String emailAluno = "";
	private long matriculaAluno = 0;

	public Aluno(long matricula) {
		ResultSet rs = getByMatricula(matricula);
		if(rs != null) {
			try {
				nomeAluno = rs.getString(2);
				emailAluno = rs.getString(3);
				matriculaAluno = rs.getLong(4);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		

	}

	public Aluno() {
		System.out.println("Informe o nome do aluno: ");
		this.nomeAluno = DadosBancoTasks.scan.nextLine();

		System.out.println("Informe o e-mail do aluno: ");
		this.emailAluno = DadosBancoTasks.scan.nextLine();

		System.out.println("Informe a matricula do aluno: ");
		try {

			this.matriculaAluno = DadosBancoTasks.scan.nextLong();
			DadosBancoTasks.scan.nextLine();

		} catch (InputMismatchException e) {
			e.printStackTrace();
		}

	}

	public void create() {
		
		Connection conn = (new DBConnection()).getConn();
		Statement stmt = null;
		
		String sql = "insert into Alunos(nome, email, matricula) values('" + this.nomeAluno + "','" + this.emailAluno + "'," + this.matriculaAluno + ")";
		
		try {
			stmt = conn.createStatement();
			if(stmt.execute(sql)) {
				System.out.println("Não funcionou");
			}else {
				int count = stmt.getUpdateCount();
				if (count >= 1) {
					System.out.println("Registro Inserido com sucesso!");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public ResultSet getByMatricula(long matricula) {
		
		Connection conn = (new DBConnection()).getConn();
		Statement stmt = null;
		
		String sql = "select * from Alunos where matricula="+ matricula;
		
		try {
			stmt = conn.createStatement();
			if (stmt.execute(sql)) {
				return stmt.getResultSet();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public void mostraDados() {
		System.out.println("Dados do Aluno: \nNome: " + this.nomeAluno + "\nEmail: " + this.emailAluno + "\nMatricula: " + this.matriculaAluno);
	}

	public int getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(int idAluno) {
		this.idAluno = idAluno;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public String getEmailAluno() {
		return emailAluno;
	}

	public void setEmailAluno(String emailAluno) {
		this.emailAluno = emailAluno;
	}

	public Long getMatriculaAluno() {
		return matriculaAluno;
	}

	public void setMatriculaAluno(Long matriculaAluno) {
		this.matriculaAluno = matriculaAluno;
	}
}