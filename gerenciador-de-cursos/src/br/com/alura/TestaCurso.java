package br.com.alura;

import java.util.List;

public class TestaCurso {
	
	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominado", "Palo");
		List<Aula> aulas =javaColecoes.getAulas();
		System.out.println(aulas);
		
		aulas.add(new Aula("Trabalhando",21));
		javaColecoes.adiciona(new Aula("Trabalhando",21));
		javaColecoes.adiciona(new Aula("Criando",22));
		
		System.out.println(aulas);
//		=
		System.out.println(javaColecoes.getAulas());
//		prova-real;
		System.out.println(aulas == javaColecoes.getAulas());
		
		
	}

}
