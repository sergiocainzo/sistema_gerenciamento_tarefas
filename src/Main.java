import br.com.sistema_de_tarefas.ListaTarefas;
import br.com.sistema_de_tarefas.Tarefa;

public class Main {
    public static void main(String[] args) throws Exception {
        ListaTarefas lista = new ListaTarefas();
        Tarefa terafa = new Tarefa("Teste 1","Teste de verificação de tarefas.",7);
        Tarefa terafa2 = new Tarefa("Teste 2","Teste de verificação de tarefas.",8);


        lista.exibirTodasTarefas();
        lista.adicionarTarefa(terafa);
        lista.adicionarTarefa(terafa2);
        lista.exibirTodasTarefas();
        lista.buscarPorId(3);
        lista.buscarPorId(1);


    }
}
