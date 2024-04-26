package Trabalho;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		//----------------------------Lendo dados----------------------------
		Scanner ler = new Scanner(System.in);
		
		//System.out.print("Nome do Aluno: ");
		//String nome = ler.nextLine();
		
		//System.out.print("Matricula: ");
		//String matricula = ler.nextLine();
		
		
		//System.out.print("Email: ");
		//String email = ler.nextLine();
		
		//System.out.print("Telefone: ");
		//int tel = ler.nextInt();
		
		//System.out.print("Nota1: ");
		//float nota1 = ler.nextFloat();
		
		//System.out.print("Nota2: ");
		//float nota2 = ler.nextFloat();
		
		//-------------------------------------------------------------------
		Controle controle = new Controle();
		
		//controle.CadastraAluno(nome, matricula, email, tel);
		//controle.CadastraAluno("mara", "999", "@maria", 999);
		//controle.CadastraAluno("aa", "9199", "@marsia", 9499);
		//controle.CadastraAluno("xx", "91499", "@kkkkkk", 940099);
		//controle.RemoveAluno("123");
		
		//controle.CadastraNotas(matricula, nota1, nota2);
		//controle.CadastraNotas("999", nota1, nota2);
		
		//System.out.println(controle.buscaAlunos("999"));
		//System.out.println(controle.listaDeAlunos());
		//controle.EditaAluno(matricula);
		//System.out.println(controle.listaDeAlunos());
		//for (int i = 0; i < 100; ++i)
		//      System.out.println();
		//--------------------------------------------------------------------------
		
		
		//menu-----------------------------------------------------------------------

		int operacao;
		
		do {
			System.out.print("\n1 - Cadastrar aluno\n2 - Remover aluno");
			System.out.print("\n3 - Editar Aluno\n4 - Buscar Aluno");
			System.out.print("\n5 - Listar alunos\n6 - Cadastrar Notas\n0 - Sair\n");
			operacao = ler.nextInt();
			switch(operacao) {
			case 1:
				System.out.print("Nome do Aluno: ");
				ler.nextLine();
				String nome = ler.nextLine();
				
				System.out.print("Matricula: ");
				String matricula = ler.nextLine();
				
				System.out.print("Email: ");
				String email = ler.nextLine();
				
				System.out.print("Telefone: ");
				int tel = ler.nextInt();
				
				controle.CadastraAluno(nome, matricula, email, tel);
			break;
			case 2:
				System.out.print("Digite matricula do aluno que deseja remover: ");
				ler.nextLine();
				String remover = ler.nextLine();
				controle.RemoveAluno(remover);
			break;
			case 3:
				System.out.print("Digite matricula do aluno que deseja editar: ");
				ler.nextLine();
				String editar = ler.nextLine();
				controle.EditaAluno(editar);
			break;
			case 4:
				System.out.print("Digite matricula do aluno que deseja buscar: ");
				ler.nextLine();
				String buscar = ler.nextLine();
				System.out.println(controle.buscaAlunos(buscar));
		    break;
			case 5:
				System.out.println("Lista de Alunos: ");
				ler.nextLine();
				System.out.println(controle.listaDeAlunos());
			break;
			case 6:
				System.out.println("Digite matricula do aluno que deseja cadastrar notas: ");
				ler.nextLine();
				String matriculanota = ler.nextLine();
				System.out.print("Nota 1: ");
				float nota1 = ler.nextFloat();
				System.out.print("Nota 2: ");
				ler.nextLine();
				float nota2 = ler.nextFloat();
				controle.CadastraNotas(matriculanota, nota1, nota2);
			break;
			}
		}while(operacao != 0);

		//---------------------------------------------------------------------------
		//controle.RemoveAluno("999");
		//System.out.println(controle.listaDeAlunos());
	}
	

}
