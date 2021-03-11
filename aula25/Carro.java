package com.loiane.cursojava.aula25;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	void exibirAutonomia() {
		
		System.out.println("A autonimia do carroé "+ capCombustivel * consumoCombustivel + "km");
	}
	 double obterAutonomia() {
	    	
		 System.out.println("Método obterAutonomia foi chamado.");
		 
    	 return capCombustivel * consumoCombustivel;
    	 
         }
	 
	   double calcularCombustivel(double km){
		   
		   double qtdCombustivel = km/consumoCombustivel;
		   
		   return qtdCombustivel;
	   }
}