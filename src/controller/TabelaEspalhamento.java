package controller;

import java.util.ArrayList;
import java.util.List;

public class TabelaEspalhamento {
    private List<List<Departamento>> tabela;
    private int tamanho;

    public TabelaEspalhamento(int tamanho) {
        this.tamanho = tamanho;
        tabela = new ArrayList<>(tamanho);
        for (int i = 0; i < tamanho; i++) {
            tabela.add(new ArrayList<>());
        }
    }

    public void inserir(Departamento departamento) {
        int posicao = hash(departamento.getAndar());
        tabela.get(posicao).add(departamento);
    }

    public List<Departamento> consultar(int andar) {
        int posicao = hash(andar);
        return tabela.get(posicao);
    }

    public boolean remover(String nomeDepartamento) {
        int posicao = hash(nomeDepartamento.hashCode());
        List<Departamento> departamentos = tabela.get(posicao);
        for (Departamento departamento : departamentos) {
            if (departamento.getNome().equals(nomeDepartamento)) {
                departamentos.remove(departamento);
                return true;
            }
        }
        return false;
    }

    private int hash(int andar) { 
        return andar % tamanho;
    }

	public void inserir(int i, String string, String string2) {
		// TODO Auto-generated method stub
		
	}

	public String consultarDepartamentosPorAndar(int andar) {
	    StringBuilder resultado = new StringBuilder();
	    List<Departamento> departamentos = consultar(andar);
	    
	    if (departamentos.isEmpty()) {
	        resultado.append("Nenhum departamento encontrado no andar ").append(andar);
	    } else {
	        resultado.append("Departamentos encontrados no andar ").append(andar).append(":\n");
	        for (Departamento departamento : departamentos) {
	            resultado.append("- ").append(departamento.getNome()).append(": ").append(departamento.getDescricao()).append("\n");
	        }
	    }
	    
	    return resultado.toString();
	}
	
}