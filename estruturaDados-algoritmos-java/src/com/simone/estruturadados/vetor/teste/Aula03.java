package com.simone.estruturadados.vetor.teste;

import com.simone.estruturadados.vetor.Vetor;

public class Aula03 {
	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(9);
		
		
			vetor.adiciona("1");
			vetor.adiciona("2");
			vetor.adiciona("3");
			
			System.out.println(vetor.tamanho());
			
			System.out.println(vetor.toString());
			
			System.out.println(vetor.busca(0));
			
	}
		

}
