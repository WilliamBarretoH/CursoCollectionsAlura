package br.com.aula;

import java.util.ArrayList;
import java.util.Collections;

public class TestaAula {

	public static void main(String[] args) {
	Aula a1 = new Aula("revisao de listas" , 20);
	Aula a2 = new Aula("listas de objetos", 15);
	Aula a3 = new Aula("relacionamento de listas",25);
	
	ArrayList<Aula> aulas = new ArrayList<>();
	aulas.add(a1);
	aulas.add(a2);
	aulas.add(a3);
	
	System.out.println(aulas);

	Collections.sort(aulas);
	System.out.println(aulas);
	
	}
}