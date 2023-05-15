package controller;

import javax.swing.JOptionPane;

public class LojaDepartamentosApp {

    public static void main(String[] args) {
        TabelaEspalhamento tabela = new TabelaEspalhamento(4);


        tabela.inserir(0, "celulares e smartphones", "Artigos para telefonia móvel");
        tabela.inserir(0, "tv e vídeo", "Artigos para televisores");
        tabela.inserir(0, "consoles e games", "Artigos para video games");
        tabela.inserir(0, "áudio", "Artigos de som");
        tabela.inserir(0, "telefonia fixa", "Artigos para telefonia");
        tabela.inserir(0, "informática", "Computadores e laptops corporativos");
        tabela.inserir(0, "acessórios e periféricos", "Hardwares");
        tabela.inserir(0, "pc gamer", "Computadores e laptops gamers");

        tabela.inserir(1, "eletrodomésticos", "Artigos Eletrodomésticos");
        tabela.inserir(1, "eletroportáteis", "Artigos Eletroportáteis");
        tabela.inserir(1, "ar e ventilação", "Ventiladores e Ar condicionado");
        tabela.inserir(1, "móveis e decoração", "Móveis");
        tabela.inserir(1, "casa e construção", "Materiais para construção");
        tabela.inserir(1, "cama, mesa e banho", "Artigos para cama, mesa e banho");

        tabela.inserir(2, "livros", "Livraria");
        tabela.inserir(2, "instrumentos musicais", "Instrumentos músicas e acessórios");
        tabela.inserir(2, "música", "Discos");
        tabela.inserir(2, "filmes e séries", "DVD e Blu-ray");

        tabela.inserir(3, "mercado", "Itens de supermercado");
        tabela.inserir(3, "automotivo", "Peças e acessórios para automóveis");
        tabela.inserir(3, "brinquedos", "Itens infantis");
        tabela.inserir(3, "bebês", "Itens para a primeira infância");
        tabela.inserir(3, "gift cards", "Cartões presente");
        tabela.inserir(3, "pet shop", "Comida e acessórios para pet");
        tabela.inserir(3, "papelaria", "Itens de papelaria");


        String andarStr = JOptionPane.showInputDialog(null, "Digite o número do andar (0-3):");
        int andar = Integer.parseInt(andarStr);

        String departamentos = tabela.consultarDepartamentosPorAndar(andar);
        JOptionPane.showMessageDialog(null, departamentos);

        String nomeDepartamento = JOptionPane.showInputDialog(null, "Digite o nome do departamento:");
        boolean removido = tabela.remover(nomeDepartamento);
        if (removido) {
            JOptionPane.showMessageDialog(null, "Departamento removido com sucesso.");
        } else {
            JOptionPane.showMessageDialog(null, "Departamento não encontrado.");
        }
    }
}