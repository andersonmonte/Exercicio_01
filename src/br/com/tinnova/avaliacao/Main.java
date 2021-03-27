package br.com.tinnova.avaliacao;

import br.com.tinnova.avaliacao.model.EstatisticasEleicao;

public class Main {

	public static void main(String[] args) {
		EstatisticasEleicao estatisticasEleicao = new EstatisticasEleicao(800, 150, 50);
		
		System.out.println("Estat�sticas da Elei��o:");
		System.out.println("Total de Eleitores: " + estatisticasEleicao.getTotalEleitores() + " = 100.00%");
		System.out.println("Votos V�lidos: " + estatisticasEleicao.getVotosValidos() + " = " + estatisticasEleicao.obterPercentualVotosValidos() + "%");
		System.out.println("Votos Brancos: " + estatisticasEleicao.getVotosBrancos() + " = " + estatisticasEleicao.obterPercentualVotosBrancos() + "%");
		System.out.println("Votos Nulos: " + estatisticasEleicao.getVotosNulos() + " = " + estatisticasEleicao.obterPercentualVotosNulos() + "%");
	}

}
