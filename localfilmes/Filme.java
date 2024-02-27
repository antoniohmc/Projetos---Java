package localfilmes;

public class Filme {

    private Long id;

    private String nome;

    private boolean disponivel;

    private String genero;

    public Filme() {
    }

    public Filme(Long id, String nome, boolean disponivel, String genero) {
        this.id = id;
        this.nome = nome;
        this.disponivel = disponivel;
        this.genero = genero;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void alugar() {
        if (isDisponivel()) {
            System.out.println("Filme " + nome + "Alugado com sucesso!");
        } else {
            throw new IllegalArgumentException("Desculpe, o filme " + nome + " não esta disponivel no momento.");
        }
    }

    public void devolver() {
        if (!isDisponivel()) {
            System.out.println("Filme " + nome + "Devolvido com sucesso!");
        } else {
            throw new IllegalArgumentException("Esse filme : " + nome
                + " Não foi alugado, por favor insira o nome corretamente do filme que você alugou");
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
