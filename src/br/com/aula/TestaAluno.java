package br.com.aula;

import java.util.HashSet;
import java.util.Set;

public class TestaAluno {
	
	public static void main(String[] args) {
		Set<String> alunos = new HashSet<>();
		
		alunos.add("Diego");
		alunos.add("Pedro");
		alunos.add("Ana");
		alunos.add("Gabi");
		
		
		System.out.println(alunos);
	}

}
