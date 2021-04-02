import java.util.ArrayList;

public class Cozinha {

    String tipo;
    int horaAbertura;
    int horaFechamento;
    String pratoPrincipal;
    ArrayList<Ingrediente> ingredientes;
    ArrayList<Funcionario> funcionarios;


    public Cozinha(String tipo,int horaAbertura, int horaFechamento, String pratoPrincipal, String[] arrayIngredientes,String[][] arrayFuncionarios) {
        this.tipo = tipo;
        this.horaAbertura = horaAbertura;
        this.horaFechamento = horaFechamento;
        this.pratoPrincipal = pratoPrincipal;
        ingredientes = new ArrayList<Ingrediente>();
        funcionarios = new ArrayList<Funcionario>();
        for(String ingrediente : arrayIngredientes){
            Ingrediente item = new Ingrediente(ingrediente);
            this.ingredientes.add(item);
        };

        for(String[] funcionarios : arrayFuncionarios) {
            Funcionario item = new Funcionario(funcionarios);
            this.funcionarios.add(item);
           }
    }


    void prepararPratos(){
        //O que eu preciso fazer para preparar um prato?
    }

    void lavarLouca(){

    }


    @Override
    public String toString() {
        return "Cozinha{" +
                "tipo='" + tipo + '\'' +
                ", horaAbertura=" + horaAbertura +
                ", horaFechamento=" + horaFechamento +
                ", pratoPrincipal='" + pratoPrincipal + '\'' +
                ", ingredientes=" + ingredientes +
                ", funcionarios=" + funcionarios +
                '}';
    }
}
