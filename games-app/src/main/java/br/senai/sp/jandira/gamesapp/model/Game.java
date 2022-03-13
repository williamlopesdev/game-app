package br.senai.sp.jandira.gamesapp.model;

import java.util.Objects;

public class Game {

	private Long id;
	private String titulo;
	private String produtora;
	private boolean zerado;
	private int nota;
	private String console;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getProdutora() {
		return produtora;
	}

	public void setProdutora(String produtora) {
		this.produtora = produtora;
	}

	public boolean isZerado() {
		return zerado;
	}

	public void setZerado(boolean zerado) {
		this.zerado = zerado;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public String getConsole() {
		return console;
	}

	public void setConsole(String console) {
		this.console = console;
	}

	@Override
	public int hashCode() {
		return Objects.hash(console, id, nota, produtora, titulo, zerado);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Game other = (Game) obj;
		return Objects.equals(console, other.console) && Objects.equals(id, other.id) && nota == other.nota
				&& Objects.equals(produtora, other.produtora) && Objects.equals(titulo, other.titulo)
				&& zerado == other.zerado;
	}

	
	
}
