package br.com.aula;

import java.util.List;

public class TestaCursoComAluno {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("dominando coleçoes", "Paulo" );
		
		
		javaColecoes.adiciona(new Aula("tabalhando com arrayList",23));
		javaColecoes.adiciona(new Aula("modelando banco",23));
		javaColecoes.adiciona(new Aula("aprendendo coleçoes",23));
		
		Aluno a1 = new Aluno("Pedro", 2123);
		Aluno a2 = new Aluno("Jp", 6536);
		Aluno a3 = new Aluno("Maiku", 6546);
		Aluno a4 = new Aluno("Biel", 2655);
		
		javaColecoes.matricula(a1);
		
		System.out.println(javaColecoes.estaMatriculado(a1));
	}
}
