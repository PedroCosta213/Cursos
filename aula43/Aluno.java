package com.loiane.cursojava.aula43;

import java.util.Arrays;

public class Aluno {
	
	
	
	public Aluno() {
		super();
		
	}
	
	
	public Aluno(String nome, String endereco, String telefone, String curso) {
		//super(nome, endereco, telefone);
		this.curso = curso;
		
	}




	private String curso;
	private double[] notas;
	
	
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas1(double[] notas2) {
		this.notas = notas2;
	}
	
	public double calcularMedia() {
		return 0;
	}
	
	public boolean verificarAprovado() {
		return true;
	}
	
	public void metodoQualquer() {
		//super.setCpf("231423423423");
	} 
	
      public String obterEtiquetaEndereco() {
		
		String s = "Endereço do Aluno: ";
		//s += this.getEndereco();
		
		 return s;
      }


	
	public void ImprimirobterEtiquetaEndereco() {
		
		System.out.println(this.obterEtiquetaEndereco());
		
		
	}


	public void setNotas(double[] notas2) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public String toString() {
		return "Aluno [curso=" + curso + ", notas=" + Arrays.toString(notas) + "]";
	}


	
	


	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (curso == null) {
			if (other.curso != null)
				return false;
		} else if (!curso.equals(other.curso))
			return false;
		if (!Arrays.equals(notas, other.notas))
			return false;
		return true;
	}
}
	/*public String toString() {
		String s = curso + "\n";
		for (double nota : notas) {
			s += nota + " ";
		}
		return s;
	}
	
	
}*/
