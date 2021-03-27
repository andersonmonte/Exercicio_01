package br.com.tinnova.avaliacao.model;

import java.math.BigDecimal;

public class EstatisticasEleicao {
	private int totalEleitores;
	private int votosValidos;
	private int votosBrancos;
	private int votosNulos;
	
	public EstatisticasEleicao(int votosValidos, int votosBrancos, int votosNulos) {
		this.totalEleitores = votosValidos + votosBrancos + votosNulos;
		this.votosValidos = votosValidos;
		this.votosBrancos = votosBrancos;
		this.votosNulos = votosNulos;
	}

	public int getTotalEleitores() {
		return totalEleitores;
	}
	
	public void setTotalEleitores(int totalEleitores) {
		this.totalEleitores = totalEleitores;
	}
	
	public int getVotosValidos() {
		return votosValidos;
	}
	
	public void setVotosValidos(int votosValidos) {
		this.votosValidos = votosValidos;
	}
	
	public int getVotosBrancos() {
		return votosBrancos;
	}
	
	public void setVotosBrancos(int votosBrancos) {
		this.votosBrancos = votosBrancos;
	}
	
	public int getVotosNulos() {
		return votosNulos;
	}
	
	public void setVotosNulos(int votosNulos) {
		this.votosNulos = votosNulos;
	}
	
	public BigDecimal obterPercentualVotosValidos() {
		double resultado  = (double)this.votosValidos / (double)this.totalEleitores * 100;
		return arredondarResultado(resultado);
	}
	
	public BigDecimal obterPercentualVotosBrancos() {
		double resultado  = (double)this.votosBrancos / (double)this.totalEleitores * 100;
		return arredondarResultado(resultado);
	}
	
	public BigDecimal obterPercentualVotosNulos() {
		double resultado  = (double)this.votosNulos / (double)this.totalEleitores * 100;
		return arredondarResultado(resultado);
	}
	
	public BigDecimal arredondarResultado(double resultado) {
		return new BigDecimal(String.valueOf(resultado)).setScale(2, BigDecimal.ROUND_HALF_UP);
	}
}
