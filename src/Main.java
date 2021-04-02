public class Main {
    public static void main(String[] args) {
        Cozinha cozinhaMineira = new Cozinha("Mineira",14,20,
                "Feijoada",new String[]{"Feijão", "Farinha", "Arroz", "Carne de Porco", "Linguiça"},
                new String[][]{{"Carlos","Cozinheiro"},{"Roberto", "Ajudante"},{"Pedro","Garçon"},{"Rafaela", "Cozinheira"}});

        Cozinha cozinhaChinesa = new Cozinha("Chinesa",10,21,
                "Yakissoba",new String[]{"Champignon", "Brócolis", "Macarrão", "Carne"},
                new String[][]{{"Ana","Cozinheiro"},{"Miro", "Ajudante"},{"Jessica", "Cozinheira"}});

        Cozinha cozinhaItaliana = new Cozinha("Italiana",13,22,
                "Pizza",new String[]{"Molho", "Macarrão", "Carne"},
                new String[][]{{"Italo","Cozinheiro"},{"Neto", "Caixa"}});

        System.out.println(cozinhaMineira.toString());
        System.out.println(cozinhaChinesa.toString());
        System.out.println(cozinhaItaliana.toString());

    }
}
