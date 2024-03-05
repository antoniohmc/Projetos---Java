package localfilmes;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Locadora locadora = new Locadora();
        Dados dados = new Dados();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            try {

                int escolha = imprimirMenu();

                switch (escolha) {

                    case 1:
                        dados.listaDeFilmes();
                        break;

                    case 2:
                        locadora.devolverFilme(scanner);
                        break;

                    case 3:
                        locadora.alugarFilme(scanner);

                        break;

                    case 0:
                        System.out.println("Saindo do programa. Até mais!");
                        System.exit(0);

                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } catch (NoSuchElementException e) {
                e.printStackTrace();
            }
        }
    }

    public static int imprimirMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEscolha uma opção:");
        System.out.println("1 - Catálogo de filmes");
        System.out.println("2 - Devolver filme");
        System.out.println("3 - Alugar filme");
        System.out.println("0 - Sair");
        System.out.print("Digite o número da opção desejada: ");
        return scanner.nextInt();
    }

}
