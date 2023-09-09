package br.com.alura;

public class Aluno {
	private String nome; 
	private int numeroMateria;
	
	public Aluno(String nome, int numeroMateria) {
		if(nome == null) {
			throw new NullPointerException();
		}
		this.nome = nome;
		this.numeroMateria = numeroMateria;
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroMateria() {
		return numeroMateria;
	}
	@Override
	public String toString() {
		return "[Alunos: " + this.nome + ", matricula: " + this.numeroMateria +"]"; 
	} 
	
	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		Aluno outro = (Aluno) obj;
		
		return this.nome.equals(outro.nome );
	}
}
