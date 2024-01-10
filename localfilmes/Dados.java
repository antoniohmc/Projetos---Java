package localfilmes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Dados {


    private Collection<Filme> filmes = new ArrayList<>();


    public Dados() {

        filmes.add(new Filme(1L, "Matrix ", "Ação"));
        filmes.add(new Filme(2L, "Se beber nao case", "Comedia"));

    }

    public Collection<Filme> buscarFilmes() {
        return filmes;
    }

    public Filme buscarFilmePorId(Long id) {

        return filmes
            .stream()
            .filter(filme -> filme.getId().equals(id))
            .findFirst()
            .orElseThrow();

    }


// Tentar trocar o parâmetro "collect" por "forEach"

    public List<Filme> listaDeFilmesPorGenero(String genero) {

        return filmes
            .stream()
            .filter(filme -> filme.getGenero().equals(genero))
            .collect(Collectors.toList());
    }

    public void listaDeFilmes() {
        filmes
            .stream()
            .forEach(filme -> System.out.println("Título: " + filme.getNome() + ", Gênero: " + filme.getGenero()));
    }
}
