import java.time.LocalDate;

public class Ingrediente {
    String nome;
    LocalDate dataValidade;
    String testeData;

    public Ingrediente() {
    }

    public Ingrediente(String nome) {
        this.nome = nome;
        LocalDate agora = LocalDate.now().plusDays(15);
        this.dataValidade = agora;

    }

    public Ingrediente(String nome, String testeData) {
        this.nome = nome;
        this.testeData = testeData;
    }

    @Override
    public String toString() {
        return "Ingrediente{" +
                "nome='" + nome + '\'' +
                ", dataValidade=" + dataValidade +
                '}';
    }
}
