package Trabalho;

import java.util.Objects;

public class Aluno {
	//Atributos
	private String nome;
	private String matricula;
	private String email;
	private int tel;
	private Notas notas;
	public int x = 0; //variavel para verificar se notas foram cadastradas
	
	//metodo construtor
	public Aluno(String nome, String matricula, String email, int tel ) {
		this.nome = nome;
		this.matricula = matricula;
		this.email = email;
		this.tel = tel;
	}

	public void addnotas(Notas notas) {
		this.notas = notas;
	}
	
	//----------------------  Getters and Setters  -------------------------------------------
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}

	
	public float getNotas1() {
		
		return this.notas.getNota1();
	}
	
	public float getNotas2() {
		
		return this.notas.getNota2();
	}

	public void setNotas(Notas notas) {
		this.notas = notas;
	}
	
	public void setNotas1(float nota1) {
		this.notas.setNota1(nota1);
	}
	
	public void setNotas2(float nota2) {
		this.notas.setNota2(nota2);
	}
	//-------------------------------------Hashcode and equals---------------------------------
	


	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(matricula, other.matricula);
	}
	
	
	
	
}
