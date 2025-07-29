import br.com.sistema_de_tarefas.ListaTarefas;
import br.com.sistema_de_tarefas.Tarefa;

public class Main {
    public static void main(String[] args) throws Exception {
        ListaTarefas lista = new ListaTarefas();
        Tarefa terafa = new Tarefa("Teste1","Teste de verificação de tarefas.",30/07/2025);

        lista.adicionarTarefa(terafa);
        lista.exibirTodasTarefas();


    }
}
