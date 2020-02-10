package br.com.aula;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("dominando coleçoes", "Paulo" );
		List<Aula> aulas = javaColecoes.getAulas();
		System.out.println(aulas);
		
		javaColecoes.adiciona(new Aula("tabalhando com arrayList",23));
		javaColecoes.adiciona(new Aula("modelando banco",23));
		javaColecoes.adiciona(new Aula("aprendendo coleçoes",23));
		
		System.out.println(aulas);
		
		System.out.println(javaColecoes.getAulas());
		
		System.out.println(javaColecoes.soma());
		
		System.out.println(javaColecoes);
	}
	
	
}
