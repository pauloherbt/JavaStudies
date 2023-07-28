package javacompleto.mapEx1;

import java.util.Objects;

public class Candidato {
    private String nome;
    private int qtdVotos;

    public Candidato(String nome, int qtdVotos) {
        this.nome = nome;
        this.qtdVotos = qtdVotos;
    }

    public String getNome() {
        return nome;
    }

    public int getQtdVotos() {
        return qtdVotos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Candidato candidato = (Candidato) o;
        return Objects.equals(nome, candidato.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
