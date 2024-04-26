package Trabalho;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Controle {
	//------------------------------------  construtor  --------------------------------------

	private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	
	
	//------------------------------------  metodos  -----------------------------------------
	public void CadastraAluno(String nome, String matricula, String email, int tel) {
		Aluno aluno = new Aluno(nome, matricula, email, tel);
		this.alunos.add(aluno);
	}
	
	public void RemoveAluno(String matricula) {
		int indice = -1;
		int local = 0;
		for (Aluno i : this.alunos) {
			indice += 1;
			if (i.getMatricula().equals(matricula)) {
				local = indice;
			}
		}
		alunos.remove(local);
	}
	


	public void CadastraNotas(String matricula, float nota1, float nota2) {
		for (Aluno i : this.alunos) {
			if (i.getMatricula().equals(matricula)) {
				Notas nts = new Notas(nota1, nota2);
				i.addnotas(nts);
				i.x = 1;
			}
		}
		
		
	}
	
	public void EditaAluno(String matricula) {
		for (Aluno i : this.alunos) {
			if (i.getMatricula().equals(matricula)) {
				Scanner lerop = new Scanner(System.in);
				System.out.println("O que deseja editar?");
				System.out.println("1 - Nome");
				System.out.println("2 - Matricula");
				System.out.println("3 - Email");
				System.out.println("4 - Telefone");
				System.out.println("5 - Notas");
				int opc = lerop.nextInt();
				
				if (opc == 1) {
					System.out.print("Novo nome: ");
					lerop.nextLine();
					String newname = lerop.nextLine();
					i.setNome(newname);
				}
				else if (opc == 2) {
					System.out.print("Nova Matrícula: ");
					lerop.nextLine();
					String newmatricula = lerop.nextLine();
					i.setMatricula(newmatricula);
				}
				else if (opc == 3) {
					System.out.print("Novo Email: ");
					lerop.nextLine();
					String newemail = lerop.nextLine();
					i.setEmail(newemail);
				}
				else if (opc == 4) {
					System.out.print("Novo Telefone: ");
					lerop.nextLine();
					int newtel = lerop.nextInt();
					i.setTel(newtel);
				}
				else if (opc == 5) {
					if (i.x == 1) {
						System.out.println("Novas notas ");
						System.out.print("Nota 1: ");
						lerop.nextLine();
						float newnota1 = lerop.nextFloat();
						i.setNotas1(newnota1);
						System.out.print("Nota 2: ");
						float newnota2 = lerop.nextFloat();
						i.setNotas2(newnota2);
					}else {
						System.out.println("Nenhuma nota foi cadastrada!");
					}
					
					
					
					
				}
			}
		}
	}
	
	
	public String buscaAlunos(String matricula) {
		String lista = "";
		for (Aluno i : this.alunos) {
			if (i.getMatricula().equals(matricula)) {
				if (i.x == 1) {
					lista +="Nome: " + i.getNome() + "\n" + "Matricula: " + i.getMatricula() + "\n" + "Email: " + i.getEmail() + "\n" + "Telefone: " + i.getTel() + "\n" + "Notas: " + i.getNotas1() + "\n" + i.getNotas2() + "\n";
				}else {
					lista +="Nome: " + i.getNome() + "\n" + "Matricula: " + i.getMatricula() + "\n" + "Email: " + i.getEmail() + "\n" + "Telefone: " + i.getTel() + "\n" + "Notas: Sem notas" + "\n";
				}
			}
			
		}
		return lista;
	}
	
	
	public String listaDeAlunos() {
		String lista = "";
		for (Aluno aluno : alunos) {
			if (aluno.x == 1) {
				lista +="Nome: " + aluno.getNome() + "\n" + "Matricula: " + aluno.getMatricula() + "\n" + "Email: " + aluno.getEmail() + "\n" + "Telefone: " + aluno.getTel() + "\n" + "Notas: " + aluno.getNotas1() + "\n" + aluno.getNotas2() + "\n";
			}else {
				lista +="Nome: " + aluno.getNome() + "\n" + "Matricula: " + aluno.getMatricula() + "\n" + "Email: " + aluno.getEmail() + "\n" + "Telefone: " + aluno.getTel() + "\n" + "Notas: Sem notas"  + "\n";
			}
			
		}
		return lista;
	}
}
