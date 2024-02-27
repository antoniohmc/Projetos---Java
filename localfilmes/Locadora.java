package localfilmes;

import java.util.Scanner;

public class Locadora {

    private final Dados dados = new Dados();
    private final Filme filme = new Filme();

    public void alugarFilme(Scanner scanner) {
        listarFilmes();

        System.out.println("Digite o Id do filme");
        Long id = scanner.nextLong();

        Filme filmeBuscado = dados.buscarFilmePorId(id);

        if (filmeBuscado.isDisponivel()) {
            filmeBuscado.alugar();
            System.out.println("Filme alugado com sucesso!");
        } else {
            throw new IllegalArgumentException(
                "Desculpe, o filme " + filmeBuscado.getNome() + "não esta disponivel no momento.");
        }

    }

    public void devolverFilme(Scanner scanner) {
        listarFilmes();

        System.out.println("Digite o id do filme");
        Long id = scanner.nextLong();

        Filme filmeBuscado = dados.buscarFilmePorId(id);

        if (!filmeBuscado.isDisponivel()) {
            filmeBuscado.devolver();
            System.out.println("Filme devolvido com sucesso!");
        }else {
            throw new IllegalArgumentException("Você nao alugou um filme com esse id, por favor insira o id novamente");
        }
    }

    private void listarFilmes() {
        dados
            .buscarFilmes()
            .forEach(System.out::println);
    }
}