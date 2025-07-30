package br.com.sistema_de_tarefas;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ListaTarefas {
    // Atributo
    List<Tarefa> listaTarefas;

    // Construtor
    public ListaTarefas() {
        this.listaTarefas = new ArrayList<>();
    }

    // Metodos Personalizados
    // Atualizar dados
    public void atualizarDadosDaTarefa(long uuid) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\t--- Atualizando Dados ---");
        Tarefa tarefaEncontrada = null;

        try {
            System.out.println(String.format("Buscando tarefa de ID: %s", uuid));
            // delay de busca
            Thread.sleep(1000);
            // Iterar a lista em busca da tarefa
            for (Tarefa tarefa : listaTarefas) {
                if (tarefa.getUuid() == uuid) {
                    // Armazenar a tarefa encontrada
                    tarefaEncontrada = tarefa;
                    // Finalizar a pesquisa da tarefa pela uuid
                    break;
                }
            }

            if (tarefaEncontrada != null) {
                boolean atualizacaoAtiva = true;

                while (atualizacaoAtiva) {
                    // Menu de alteração
                    System.out.println("Escolha qual campo deseja atualizar:");
                    System.out.println("1 - Titulo");
                    System.out.println("2 - Descrição");
                    System.out.println("3 - Data de vencimento");
                    System.out.println("4 - Prioridade");
                    System.out.println("5 - Status");
                    System.out.println("0 - Sair");
                    System.out.print("Opção: ");
                    String opcao = scan.nextLine().trim().replaceAll("\\s+", " ");
                    while (opcao.isBlank() || opcao == null || Integer.parseInt(opcao) > 5
                            || Integer.parseInt(opcao) < 0) {
                        System.out.println("\nOpção inválida, tente novamente.\n");
                        System.out.println("Escolha qual campo deseja atualizar:");
                        System.out.println("1 - Titulo");
                        System.out.println("2 - Descrição");
                        System.out.println("3 - Data de vencimento");
                        System.out.println("4 - Prioridade");
                        System.out.println("5 - Status");
                        System.out.println("0 - Sair");
                        System.out.print("Opção: ");
                        opcao = scan.nextLine().trim().replaceAll("\\s+", " ");
                    }
                    switch (Integer.parseInt(opcao)) {
                        case 1:
                            System.out.println(String.format("Titulo atual: %s", tarefaEncontrada.getTitulo()));
                            System.out.print("Novo titulo: ");
                            String novoTitulo = scan.nextLine().trim().replaceAll("\\s+", " ").toUpperCase();
                            tarefaEncontrada.setTitulo(novoTitulo);

                            // Mensagem de sucesso
                            System.out.println(String.format("Titulo da ID %s, atualizado com sucesso",
                                    tarefaEncontrada.getUuid()));

                            // Retornando ao menu principal
                            System.out.println("Deseja atualizar mais algum campo?");
                            System.out.println("S - Sim\nN - Não");
                            System.out.print("Escolha: ");
                            String escolha = scan.nextLine().trim().toUpperCase();
                            while (!escolha.equals("S") && !escolha.equals("N")) {
                                System.out.println("Opção inválida, tente novamente");
                                System.out.println("Deseja atualizar mais algum campo?");
                                System.out.println("S - Sim\nN - Não");
                                System.out.print("Escolha: ");
                                escolha = scan.nextLine().trim().toUpperCase();
                            }
                            if (escolha.equals("S")) {
                                System.out.println("Retornando para o menu principal");
                            } else {
                                System.out.println("Saindo da aplicação");
                                atualizacaoAtiva = false;
                            }
                            // Break do case
                            break;
                        case 2:
                            System.out.println(String.format("Descrição atual: %s", tarefaEncontrada.getDescricao()));
                            System.out.print("Nova Descrição: ");
                            String novaDescricao = scan.nextLine().trim().replaceAll("\\s+", " ").toUpperCase();
                            tarefaEncontrada.setDescricao(novaDescricao);

                            // Mensagem de sucesso
                            System.out.println(String.format("Descrição da ID: %s, atualizada com sucesso.",
                                    tarefaEncontrada.getUuid()));

                            // Retornando ao menu principal
                            System.out.println("Deseja atualizar mais algum campo?");
                            System.out.println("S - Sim\nN - Não");
                            System.out.print("Escolha: ");
                            escolha = scan.nextLine().trim().toUpperCase();
                            while (!escolha.equals("S") && !escolha.equals("N")) {
                                System.out.println("Opção inválida, tente novamente");
                                System.out.println("Deseja atualizar mais algum campo?");
                                System.out.println("S - Sim\nN - Não");
                                System.out.print("Escolha: ");
                                escolha = scan.nextLine().trim().toUpperCase();
                            }
                            if (escolha.equals("S")) {
                                System.out.println("Retornando para o menu principal");
                            } else {
                                System.out.println("Saindo da aplicação");
                                atualizacaoAtiva = false;
                            }
                            // Break do case
                            break;
                        case 3:
                            System.out.println(String.format("Data de vencimento atual: %s",
                                    tarefaEncontrada.getDataVencimento()));
                            System.out.print("Nova data de vencimento: ");
                            String novaData = scan.nextLine().trim();

                            while (novaData.isBlank() || !novaData.matches("\\d+") || Integer.parseInt(novaData) < 0) {
                                System.out.println("Campo obrigatório e com um valor positivo.");
                                System.out.print("Nova data de vencimento: ");
                                novaData = scan.nextLine().trim();
                            }

                            tarefaEncontrada.setDataVencimento(Integer.parseInt(novaData));

                            // Mensagem de sucesso
                            System.out.println(String.format("Data de Vencimento do ID: %s atualizada com sucesso.",
                                    tarefaEncontrada.getUuid()));

                            // Retornando ao menu principal
                            System.out.println("Deseja atualizar mais algum campo?");
                            System.out.println("S - Sim\nN - Não");
                            System.out.print("Escolha: ");
                            escolha = scan.nextLine().trim().toUpperCase();
                            while (!escolha.equals("S") && !escolha.equals("N")) {
                                System.out.println("Opção inválida, tente novamente");
                                System.out.println("Deseja atualizar mais algum campo?");
                                System.out.println("S - Sim\nN - Não");
                                System.out.print("Escolha: ");
                                escolha = scan.nextLine().trim().toUpperCase();
                            }
                            if (escolha.equals("S")) {
                                System.out.println("Retornando para o menu principal");
                            } else {
                                System.out.println("Saindo da aplicação");
                                atualizacaoAtiva = false;
                            }
                            // Break do case
                            break;

                        case 4:
                            System.out.println(String.format("Prioridade atual: %s", tarefaEncontrada.getPrioridade()));
                            System.out.println("Nova Propriedade:");
                            System.out.println("1 - Alta");
                            System.out.println("2 - Media");
                            System.out.println("3 - Baixa");
                            System.out.print("Opção: ");
                            String novaPrioridade = scan.nextLine().trim();

                            while (novaPrioridade.isBlank() || !novaPrioridade.matches("\\d+")
                                    || Integer.parseInt(novaPrioridade) < 1 || Integer.parseInt(novaPrioridade) > 3) {
                                System.out.println("Opção inválida. Escolha entre [1-3]");
                                System.out.print("Nova Propriedade: ");
                                System.out.println("1 - Alta");
                                System.out.println("2 - Media");
                                System.out.println("3 - Baixa");
                                System.out.print("Opção: ");
                                novaPrioridade = scan.nextLine().trim();
                            }

                            if (Integer.parseInt(novaPrioridade) == 1) {
                                tarefaEncontrada.setPrioridade(Prioridade.ALTA);
                            } else if (Integer.parseInt(novaPrioridade) == 2) {
                                tarefaEncontrada.setPrioridade(Prioridade.MEDIA);
                            } else {
                                tarefaEncontrada.setPrioridade(Prioridade.BAIXA);
                            }

                            // Mensagem de sucesso
                            System.out.println(String.format("Prioridade da ID: %s, alterada com sucesso.",
                                    tarefaEncontrada.getPrioridade()));

                            // Retornando ao menu principal
                            System.out.println("Deseja atualizar mais algum campo?");
                            System.out.println("S - Sim\nN - Não");
                            System.out.print("Escolha: ");
                            escolha = scan.nextLine().trim().toUpperCase();
                            while (!escolha.equals("S") && !escolha.equals("N")) {
                                System.out.println("Opção inválida, tente novamente");
                                System.out.println("Deseja atualizar mais algum campo?");
                                System.out.println("S - Sim\nN - Não");
                                System.out.print("Escolha: ");
                                escolha = scan.nextLine().trim().toUpperCase();
                            }
                            if (escolha.equals("S")) {
                                System.out.println("Retornando para o menu principal");
                            } else {
                                System.out.println("Saindo da aplicação");
                                atualizacaoAtiva = false;
                            }
                            // Break do case
                            break;
                        case 5:
                            System.out.println(String.format("Status atual: %s", tarefaEncontrada.getStatus()));
                            System.out.println("Novo Status: ");
                            System.out.println("1 - Pendente");
                            System.out.println("2 - Em Andamento");
                            System.out.println("3 - Concluida");
                            System.out.print("Opção: ");
                            String novoStatus = scan.nextLine().trim();

                            while (novoStatus.isBlank() || !novoStatus.matches("\\d+")
                                    || Integer.parseInt(novoStatus) < 1 || Integer.parseInt(novoStatus) > 3) {
                                System.out.println("Opção inválida. Escolha entre [1-3]");
                                System.out.println("Novo Status: ");
                                System.out.println("1 - Pendente");
                                System.out.println("2 - Em Andamento");
                                System.out.println("3 - Concluida");
                                System.out.print("Opção: ");
                                novoStatus = scan.nextLine().trim();
                            }

                            if (Integer.parseInt(novoStatus) == 1) {
                                tarefaEncontrada.setStatus(Status.PENDENTE);
                            } else if (Integer.parseInt(novoStatus) == 2) {
                                tarefaEncontrada.setStatus(Status.EM_ANDAMENTO);
                            } else {
                                tarefaEncontrada.setStatus(Status.CONCLUIDA);
                            }
                            // Mensagem de sucesso
                            System.out.println(String.format("Status da ID: %s, atualizada com sucesso.",
                                    tarefaEncontrada.getUuid()));

                            // Retornando ao menu principal
                            System.out.println("Deseja atualizar mais algum campo?");
                            System.out.println("S - Sim\nN - Não");
                            System.out.print("Escolha: ");
                            escolha = scan.nextLine().trim().toUpperCase();
                            while (!escolha.equals("S") && !escolha.equals("N")) {
                                System.out.println("Opção inválida, tente novamente");
                                System.out.println("Deseja atualizar mais algum campo?");
                                System.out.println("S - Sim\nN - Não");
                                System.out.print("Escolha: ");
                                escolha = scan.nextLine().trim().toUpperCase();
                            }
                            if (escolha.equals("S")) {
                                System.out.println("Retornando para o menu principal");
                            } else {
                                System.out.println("Saindo da aplicação");
                                atualizacaoAtiva = false;
                            }
                            // Break do case
                            break;

                        case 0:
                            System.out.println("Saindo do menu de atualização de tarefa");
                            atualizacaoAtiva = false;
                            break;
                        default:
                            System.out.println("Opção inválida (erro interno). Retornando ao menu principal");
                            break;
                    }

                }

            } else {
                System.out.println(String.format("Tarefa de ID: %s não localizada.", uuid));
            }

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            System.out.println(String.format("\t------------------------\n"));
            scan.close();
        }

    }

    // Pesquisa por ID
    public void buscarPorId(long uuid) {
        System.out.println("\t--- Buscando por ID ---");

        try {
            System.out.println("Buscando ...");
            Thread.sleep(1000);
            if (listaTarefas.isEmpty()) {
                System.out.println("A lista de tarefas está vazia.");
                // System.out.println(String.format("\t------------------------\n"));
                return;
            }

            // Atributos para localizar a tarefa
            Tarefa tarefaEncontrada = null;

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

        // Adicionando à lista de Tarefas
        try {
            System.out.println(String.format("Adicionando tarefa:"));
            Thread.sleep(1000);

            // Caso um dos itens não seja adicionado
            if (tarefa.getTitulo() == null || tarefa.getTitulo().trim().isEmpty() || tarefa.getDescricao() == null
                    || tarefa.getDescricao().trim().isEmpty()) {
                System.out.println(String.format(
                        "Erro ao adicionar tarefa.\nVerificar os campos 'Titulo' e 'Descrição', são campos obrigatórios."));
                // System.out.println(String.format("\t------------------------\n"));
                return;
            }

            // Incrementando o valor da Uuid
            tarefa.setUuid(Tarefa.getProximoId());
            Tarefa.incrementarProximoId();
            System.out.println(tarefa.getTitulo());
            listaTarefas.add(tarefa);
            Thread.sleep(1000);
            System.out.println(String.format("Adicionada com sucesso! ID: %d", tarefa.getUuid()));
        } catch (InterruptedException e) {
            System.out.println("A adição da tarefa foi interrompida.");
            Thread.currentThread().interrupt();
        } finally {
            System.out.println(String.format("\t------------------------\n"));
        }
    }

    // Exibição de Tarefas
    public void exibirTodasTarefas() {
        System.out.println(String.format("\t--- Lista de Tarefas ---"));

        try {
            System.out.println("Processando...");
            Thread.sleep(1000);
            if (listaTarefas.isEmpty()) {
                System.out.println(String.format("A Lista de tarefas está vazia."));
                // System.out.println(String.format("\t------------------------\n"));
                return;
            }
            for (Tarefa tarefa : listaTarefas) {
                System.out.println(String.format(
                        "ID: %d\nTitulo: %s\nDescrição: %s\nData de Vencimento: %d\nPrioridade: %s\nStatus: %s\n",
                        tarefa.getUuid(), tarefa.getTitulo().toUpperCase(), tarefa.getDescricao().toUpperCase(),
                        tarefa.getDataVencimento(),
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
