package locadora;

public class Menu {
    public static void main(String[] args) {
        ListaDeFilmes listaDeFilmes = new ListaDeFilmes();

        Filme filme1 = new Filme(
                "PODEROSO CHEFÃO",
                "DRAMA",
                1992
        );

        Filme filme2 = new Filme(
                "INTERESTELAR",
                "FICÇÃO",
                2012
        );

        Filme filme3 = new Filme(
                "INVOCAÇÃO DO MAL",
                "TERROR",
                2012
        );

        Filme filme4 = new Filme(
                "TITANIC",
                "DRAMA",
                1997
        );

        for (int i = 1; i <= 30; i++) {
            String titulo = "Filme " + i;
            String genero = "Gênero " + i;
            int ano = 1950 + i; // Ajuste conforme necessário

            Filme filme = new Filme(titulo, genero, ano);
            listaDeFilmes.adicionarFilme(filme);
        }

        while (true) {

        }
    }
}
