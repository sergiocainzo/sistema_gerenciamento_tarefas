import br.com.sistema_de_tarefas.ListaTarefas;
import br.com.sistema_de_tarefas.Tarefa;

public class Main {
    public static void main(String[] args) throws Exception {
        ListaTarefas lista = new ListaTarefas();
        Tarefa terafa = new Tarefa(null,"Teste de verificação de tarefas.",7);
        Tarefa terafa2 = new Tarefa("Teste 2","Teste de verificação de tarefas.",8);
        Tarefa terafa3 = new Tarefa(null,"Teste de verificação de tarefas.",2);
        Tarefa terafa4 = new Tarefa("Teste 4","Teste de verificação de tarefas.",10);


        lista.exibirTodasTarefas();
        lista.adicionarTarefa(terafa);
        lista.adicionarTarefa(terafa2);
        //lista.adicionarTarefa(terafa3);
        //lista.adicionarTarefa(terafa4);
        lista.exibirTodasTarefas();
        //lista.buscarPorId(3);
        //lista.buscarPorId(1);


    }
}
