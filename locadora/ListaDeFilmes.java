package locadora;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaDeFilmes {
    List<Filme> filmes = new ArrayList<>();

    public void adicionarFilme(Filme filme) {
        filmes.add(filme);
    }

    public void catalogoDeFilmes() {
        for (Filme filme : filmes) {
            System.out.println("Nome: " + filme.getNome() +
                    "Genero: " + filme.getGenero() +
                    "Data de Lançamento: " + filme.getDataLancamento());
        }
    }

    public void listaDeFilmesPorGenero(String genero) {
        filmes
                .stream()
                .filter(filme -> filme.getGenero().equals(genero))
                .forEach(System.out::println);
    }

    public void alugarFilme(Filme filme, Scanner scanner) {
        System.out.println("Digite o nome do filme qu deseja alugar");
        scanner.nextLine();
        filmes.remove(filme);

    }

    public void devolverFilme(Filme filme) {
        filmes.add(filme);
    }
}
