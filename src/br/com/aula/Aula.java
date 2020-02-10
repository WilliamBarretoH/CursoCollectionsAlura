package br.com.aula;

public class Aula implements Comparable<Aula> {
	
	public String titulo;
	public int tempo;
	
	public Aula(String titulo, int tempo) {
	
		this.titulo = titulo;
		this.tempo = tempo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public int getTempo() {
		return tempo;
	}
	
	@Override
	public String toString() {
		return "[Aula " + this.titulo + "," + this.tempo + "minutos";
	
	}

	//compara um objeto com ele mesmo
	@Override
	public int compareTo(Aula outraAula) {
		return this.titulo.compareTo(outraAula.titulo);
	}

}
