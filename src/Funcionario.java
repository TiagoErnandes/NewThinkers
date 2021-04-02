public class Funcionario {
    String nome;
    String atividade;

    public Funcionario() {
    }

    public Funcionario(String nome, String atividade) {
        this.nome = nome;
        this.atividade = atividade;
    }
    public Funcionario(String[] array) {
        this.nome = array[0];
        this.atividade = array[1];
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", atividade='" + atividade + '\'' +
                '}';
    }
}
