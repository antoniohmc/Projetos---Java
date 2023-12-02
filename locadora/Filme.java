package locadora;

import java.util.Objects;

public class Filme {
    private String nome;
    private String genero;
    private int dataLancamento;

    public Filme(String nome, String genero, int dataLancamento) {
        this.nome = nome;
        this.genero = genero;
        this.dataLancamento = dataLancamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(int dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Filme filme = (Filme) o;
        return Objects.equals(nome, filme.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public String toString() {
        return "Filme{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", dataLancamento=" + dataLancamento +
                '}';
    }
}
