package br.com.sistema_de_tarefas;

public class Tarefa {

    // atributos
    protected int uuid;
    protected String titulo;
    protected String descricao;
    protected int dataVencimento;
    protected Prioridade prioridade;
    protected Status status;

    // Construtor
    public Tarefa(String titulo, String descricao, int dataVencimento) {
        this.setTitulo(titulo);
        this.setDescricao(descricao);
        this.setDataVencimento(dataVencimento);
        this.setPrioridade(prioridade.MEDIA);
        this.setStatus(status.PENDENTE);
    }

    // Metodos Getter and Setter
    public int getUuid() {
        return uuid;
    }

    public void setUuid(int uuid) {
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

    // Metodos Personalizados





    // Exibição na tela
    @Override
    public String toString() {
        return "Tarefa [uuid=" + uuid + ", titulo=" + titulo + ", descricao=" + descricao + ", dataVencimento="
                + dataVencimento + ", prioridade=" + prioridade + ", status=" + status + "]";
    }

}
