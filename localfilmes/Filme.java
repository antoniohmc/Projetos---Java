package localfilmes;

public class Filme {

    private Long id;

    private String nome;

    private boolean disponivel;

    private Genero genero;

    public Filme() {
    }

    public Filme(Long id, String nome, boolean disponivel, Genero genero) {
        this.id = id;
        this.nome = nome;
        this.disponivel = disponivel;
        this.genero = genero;
    }

    public Filme(Long id, String nome, String genero) {
        this.id = id;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public void alugar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("Filme " + nome + "Alugado com sucesso!");
        } else {
            throw new IllegalArgumentException("Desculpe, o filme " + nome + "não esta disponivel no momento.");
        }
    }

    public void devolver() {
        if (disponivel) {
            disponivel = true;
            System.out.println("Filme " + nome + "Devolvido com sucesso!");
        } else {
            throw new IllegalArgumentException("Esse filme " + nome
                + "Não foi alugado, por favor insira o nome corretamente do filme que você alugou");
        }
    }

    @Override
    public String toString() {
        return "Filme{" +
            "id=" + id +
            ", nome='" + nome + '\'' +
            ", disponivel=" + disponivel +
            ", genero=" + genero +
            '}';
    }
}
