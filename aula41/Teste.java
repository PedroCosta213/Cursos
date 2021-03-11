package com.loiane.cursojava.aula41;

import com.loiane.cursojava.aula40.Aluno;
import com.loiane.cursojava.aula40.Pessoa;
import com.loiane.cursojava.aula40.Professor;

public class Teste {

	public static void main(String[] args) {
	  
		 Pessoa pessoa = new Pessoa();
		 Pessoa aluno = new Aluno();
		 Pessoa professor = new Professor();
		 
		 pessoa.setEndereco("Rua 1, num 1");
		 aluno.setEndereco("Rua 2, num 2");
         professor.setEndereco("Rua  3, num 3");
         
        

	}

}
