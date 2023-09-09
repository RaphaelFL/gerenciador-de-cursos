package br.com.alura;

public class TesteCursoComAluno {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominado", "Palo");
		javaColecoes.adiciona(new Aula("Trabalhando",21));
		javaColecoes.adiciona(new Aula("Criando",22));
		
		Aluno a1 = new Aluno("Rodrigo", 3454);
		Aluno a2= new Aluno("Patricio", 3355);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2 );
		
		javaColecoes.getAlunos().forEach(a-> {
			System.out.println(a);
		});
		
		System.out.println(a1 + " está matriculado? " + javaColecoes.estaMatriculado(a1));
		
		Aluno rodrigo = new Aluno("Rodrigo",3454);
		System.out.println("E esse Rodrigo, está matriculado? ");
		System.out.println(javaColecoes.estaMatriculado(rodrigo));
		
		System.out.println("O ai é equals ao Rodrigoi?");
		System.out.println(a1.equals(rodrigo));
		
	}
}
