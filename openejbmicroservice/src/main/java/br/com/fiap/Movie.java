package br.com.fiap;

public class Movie {

	private Long id;
	private String diretor;
	private String titulo;
	private Integer ano;
	
	public Movie() {
	}

	public Movie(String diretor, String titulo, Integer ano) {
		this.diretor = diretor;
		this.titulo = titulo;
		this.ano = ano;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}
}
