package com.loiane.cursojava.aula36;

public class Teste {

	public static void main(String[] args) {
		
		
	  Contato contato = new Contato ();
	  contato.setNome("Tyrion");
	  //contato.setEndereco("Cascavel");
	  //contato.setTelefone("45 00009-9999");
	  
	  //criar objeto endereco
	  
	//relaciomaneto tem-um endereco
	  
	  Endereco end = new Endereco();
	  end.setNomeRua("awdawd");
	  end.setNumero("n/a");
	  end.setComplemento("-");
	  end.setCidade("Cascavel uai");
	  end.setEstado("PR");
	  end.setCep("9999999");
	  
	  contato.setEndereco(end);
	  
	  //relaciomaneto tem-um telefone
	  
	  Telefone telefone = new Telefone();
	  telefone.setTipo("celular");
	  telefone.setDdd("45");
	  telefone.setNumero("45 00009-9999");
	  
	  Telefone telefone2 = new Telefone();
	  telefone2.setTipo("casa");
	  telefone2.setDdd("45");
	  telefone2.setNumero("45 555555599");
	  
	  	Telefone[] telefones = new Telefone[2];
	  	telefones[0] = telefone;
	  	telefones[1] = telefone2;
	  
	  
	  //contato.setTelefone(telefone);
	  	
	  	contato.setTelefones(telefones);
	  	
	  
	  
	  //Teste saida no console
	  
	  
	  System.out.println(contato.getNome());
	  //System.out.println(contato.getTelefone());
	  
	  if (contato.getEndereco() != null) {
		  System.out.println(contato.getEndereco().getCidade());
	  }
	  
	  //if (contato != null && contato.getTelefone() != null) {
		  //System.out.println(contato.getTelefone().getDdd() + " " + contato.getTelefone().getNumero());
		  
	 
	
	    if (contato != null && contato.getTelefones() != null ) {
			for (Telefone t : contato.getTelefones()) {
				System.out.println(t.getDdd() +  " " + t.getNumero());
			}
		  
		  
	    }

	}

}
