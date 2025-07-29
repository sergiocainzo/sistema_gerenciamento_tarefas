package br.com.sistema_de_tarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    // Atributo
    List<Tarefa> listaTarefas;

    // Construtor
    public ListaTarefas() {
        this.listaTarefas = new ArrayList<>();
    }

    // Metodos Personalizados
    // Pesquisa por ID
    public void buscarPorId(long uuid) {
        System.out.println("\t--- Buscando por ID ---");
        if (listaTarefas.isEmpty()) {
            System.out.println("A lista de tarefas está vazia.");
            return;
        }

        // Atributos para localizar a tarefa
        Tarefa tarefaEncontrada = null;
        try {
            System.out.println("Buscando ...");
            Thread.sleep(1000);
            System.out.println("\tResultado da busca");

            // Itera sobre a lista para encontrar a tarefa
            for (Tarefa tarefa : listaTarefas) {
                if (tarefa.getUuid() == uuid) {
                    // Armazenando a tarefa encontrada.
                    tarefaEncontrada = tarefa;
                    // Parando assim que encontra a uuid informada
                    break;
                }
            }

            // Condições para a exibição dos resultados
            if (tarefaEncontrada != null) {
                System.out.println(String.format(
                        "ID: %d\nTitulo: %s\nDescrição: %s\nData de Vencimento: %d\nPrioridade: %s\nStatus: %s\n",
                        tarefaEncontrada.getUuid(), tarefaEncontrada.getTitulo(), tarefaEncontrada.getDescricao(),
                        tarefaEncontrada.getDataVencimento(),
                        tarefaEncontrada.getPrioridade(),
                        tarefaEncontrada.getStatus()));
            } else {
                System.out.println(String.format("ID: %d, não encontrada.", uuid));
            }

        } catch (InterruptedException e) {
            System.out.println("A busca foi interrompida!");
            Thread.currentThread().interrupt();
        } finally {
            System.out.println(String.format("\t------------------------\n"));
        }
    }

    // Adicionar Terafas
    public void adicionarTarefa(Tarefa tarefa) {
        System.out.println("\t--- Adicionando Tarefa ---");
        // Caso um dos itens não seja adicionado
        if (tarefa.getTitulo() == null || tarefa.getDescricao() == null) {
            System.out.println(String.format("Os campos 'Titulo' e 'Descrição' são obrigatórios."));
            return;
        }

        // Adicionando à lista de Tarefas
        try {
            System.out.println(String.format("Adicionando tarefa: %s.", tarefa.titulo));
            Thread.sleep(2000);
            listaTarefas.add(tarefa);
            System.out.println(String.format("Adicionada com sucesso!"));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            System.out.println(String.format("\t------------------------\n"));
        }

    }

    // Exibição de Tarefas
    public void exibirTodasTarefas() {
        System.out.println(String.format("\t--- Lista de Tarefas ---"));
        if (listaTarefas.isEmpty()) {
            System.out.println(String.format("A Lista de tarefas está vazia."));
            return;
        }
        try {
            Thread.sleep(1000);
            for (Tarefa tarefa : listaTarefas) {
                System.out.println(String.format(
                        "ID: %d\nTitulo: %s\nDescrição: %s\nData de Vencimento: %d\nPrioridade: %s\nStatus: %s\n",
                        tarefa.getUuid(), tarefa.getTitulo(), tarefa.getDescricao(), tarefa.getDataVencimento(),
                        tarefa.getPrioridade(),
                        tarefa.getStatus()));
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            System.out.println(String.format("\t------------------------\n"));
        }
    }
}
