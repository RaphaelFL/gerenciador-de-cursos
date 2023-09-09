package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TesteAlunos {
	
	public static void main(String[] args) {
		Set<String> alunos = new HashSet<>();
		alunos.add("Rodrigo");
		alunos.add("Carlos");
		alunos.add("Jonas");
		alunos.add("Diego");
		alunos.add("Diego"); 
		
		boolean carlosEsta = alunos.contains("Carlos");
		System.out.println(carlosEsta);
		
		alunos.remove("Jonas");
		
		System.out.println(alunos.size());
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		System.out.println("----------------------------");
		alunos.forEach(aluno ->{
			System.out.println(aluno);
		});
		
		List<String> alunosOrdem = new ArrayList<>(alunos);
		Collections.sort(alunosOrdem);
		alunosOrdem.get(2);
		
	}

}
