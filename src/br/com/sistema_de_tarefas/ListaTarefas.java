package br.com.sistema_de_tarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    // Atributo
    List<Tarefa> listaTarefas;

    // Construtor
    public ListaTarefas(){
        this.listaTarefas = new ArrayList<>();
    }

    // Metodos Personalizados

    // Adicionar Terafas
    public void adicionarTarefa(Tarefa tarefa){
        System.out.println("\t--- Adicionando Tarefa ---");
        if (tarefa.getTitulo() == null && tarefa.getDescricao() == null) {
            System.out.println(String.format("Os campos 'Titulo' e 'Descrição' são obrigatórios."));
        }

        // Adicionando à lista de Tarefas
        listaTarefas.add(tarefa);
        


        System.out.println(String.format("\t------------------------"));
    }


    // Exibição de Tarefas
    public void exibirTodasTarefas(){
        System.out.println(String.format("\t--- Lista de Tarefas ---"));
        if (listaTarefas.isEmpty()) {
            System.out.println(String.format("A Lista de tarefas está vazia."));
        }
        for (int i = 0; i < listaTarefas.size(); i++) {
            System.out.println(i);
        }

        System.out.println(String.format("\t------------------------"));
    }
}
