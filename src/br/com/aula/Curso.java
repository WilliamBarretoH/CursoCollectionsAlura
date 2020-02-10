package br.com.aula;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	private Set<Aluno> alunos = new HashSet<>();

	public Curso(String nome, String instrutor) {

		this.nome = nome;
		this.instrutor = instrutor;

	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	//Retorna a lista de Aulas de forma encapsulada (nao pode adicionar nem remover de forma direta)
	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}
	
	//adiciona aula na lista Aulas
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
	
	//calculando o tempo total de um Curso
	public int soma() {
		int tempototal = 0;
		for (Aula aula : aulas) {
			tempototal += aula.getTempo();
		}
		return tempototal;
	}
	
	//convertendo objeto para String
	@Override
	public String toString() {
		return "[Curso " + nome + " duraçao do curso " + soma() + " minutos]";
	}

	//matriculando aluno no Set
	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		
	}

	//buscando alunos no Set de alunos
	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno); 
	}

}
