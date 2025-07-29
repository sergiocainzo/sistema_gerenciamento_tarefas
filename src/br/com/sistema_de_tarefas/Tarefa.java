package br.com.sistema_de_tarefas;

public class Tarefa {

    // Contador sequencial
    private static long proximoID = 1;

    // atributos
    protected long uuid;
    protected String titulo;
    protected String descricao;
    protected int dataVencimento;
    protected Prioridade prioridade;
    protected Status status;

    // Construtor
    public Tarefa(String titulo, String descricao, int dataVencimento) {
        this.setUuid(0);
        this.setTitulo(titulo);
        this.setDescricao(descricao);
        this.setDataVencimento(dataVencimento);
        this.setPrioridade(Prioridade.MEDIA);
        this.setStatus(Status.PENDENTE);
    }

    // Metodos Getter and Setter
    public long getUuid() {
        return uuid;
    }

    public void setUuid(long uuid) {
        this.uuid = uuid;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(int dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public static long getProximoId() {
        return proximoID;
    }

    public static void incrementarProximoId() {
        proximoID++;
    }

    public static void descrementarProximoId() {
        if (proximoID > 1) {
            proximoID--;
        }
    }

    // Metodos Personalizados

    // Exibição na tela
    @Override
    public String toString() {
        return "Tarefa [uuid=" + uuid + ", titulo=" + titulo + ", descricao=" + descricao + ", dataVencimento="
                + dataVencimento + ", prioridade=" + prioridade + ", status=" + status + "]";
    }

}
