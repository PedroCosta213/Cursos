package com.loiane.cursojava.aula39;

public class Aluno extends Pessoa{
	
	
	
	public Aluno() {
		super();
		
	}
	
	
	public Aluno(String nome, String endereco, String telefone, String curso) {
		super(nome, endereco, telefone);
		this.curso = curso;
		
	}




	private String curso;
	private double notas;
	
	public void verificarAcesso() {
		
		this.nomeVisibilidade = "awdawd";
		super.nomeVisibilidade = "awdawd";
	}
	
	
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double getNotas() {
		return notas;
	}
	public void setNotas(double notas) {
		this.notas = notas;
	}
	
	public double calcularMedia() {
		return 0;
	}
	
	public boolean verificarAprovado() {
		return true;
	}
	
	public void metodoQualquer() {
		super.setCpf("231423423423");
	}

}
