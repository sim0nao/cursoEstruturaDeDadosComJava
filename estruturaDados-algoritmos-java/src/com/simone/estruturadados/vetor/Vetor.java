package com.simone.estruturadados.vetor;

import java.util.Arrays;

public class Vetor {
	
	private String[] elementos;
	private int tamanho;
	
	public Vetor(int capacidade) {
		this.elementos = new String [capacidade];
		this.tamanho = 0;
	}
	
	/*
	 * public void adiciona(String elemento) { for (int i=0;
	 * i<this.elementos.length; i++) { if(this.elementos[i] == null) {
	 * this.elementos[i] = elemento; break; } } } 
	 * // Problema: não verifica tamanho do vetor, percorre todo array para add
	 */
	
	public boolean adiciona (String elemento){
		
		if (this.tamanho < this.elementos.length) {
		this.elementos[this.tamanho] = elemento;
		tamanho++;
		return true;
		} 
		return false;
	}
	
	public String busca (int posicao){
		if (!(posicao >=0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		} else
		return this.elementos[posicao];
	}
	
	public int tamanho() {
		return this.tamanho;
	}
	
	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[ ");
		for (int i=0; i<this.tamanho-1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}
		
		
		if(this.tamanho >0) {
			s.append(this.elementos[this.tamanho-1]);
		}
		s.append(" ]");
		
		
		//System.out.println(s.length());
		
		return s.toString();
	}
	
	
	

	
}
