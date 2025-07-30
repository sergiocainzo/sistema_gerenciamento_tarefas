import java.util.Scanner;

import br.com.sistema_de_tarefas.ListaTarefas;
import br.com.sistema_de_tarefas.Tarefa;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanMain = new Scanner(System.in);
        ListaTarefas lista = new ListaTarefas(scanMain);
        Tarefa terafa = new Tarefa(null, "Teste de verificação de tarefas.", 7);
        Tarefa terafa2 = new Tarefa("Teste 2", "Teste de verificação de tarefas.", 8);
        Tarefa terafa3 = new Tarefa(null, "Teste de verificação de tarefas.", 2);
        Tarefa terafa4 = new Tarefa("Teste 4", "Teste de verificação de tarefas.", 10);

        // Inicio dos testes

        // Exibir lista
        lista.exibirTodasTarefas();

        // Adicionando Tarefas (Com Problema | Com Sucesso)
        lista.adicionarTarefa(terafa);
        lista.adicionarTarefa(terafa2);
        lista.adicionarTarefa(terafa3);
        lista.adicionarTarefa(terafa4);

        // Exibindo lista atualizada.
        lista.exibirTodasTarefas();

        // Realizando pesquisa por ID (Com problema | Com sucesso)
        lista.buscarPorId(3);
        lista.buscarPorId(1);

        // Atualizar dados da tarefa
        lista.atualizarDadosDaTarefa(1);

        // Remover uma tarefa por id
        lista.removerTarefaPorId(2);

        // Atualização da lista
        lista.exibirTodasTarefas();

        // Fechando o Scanner
        scanMain.close();

    }
}
