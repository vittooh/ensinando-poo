package com.digitalbricklayer.abstracaoheranca;

public class Artigo {

    protected String nome;

    public String nomeAutor;

    public Integer qtPaginas;

    public boolean possuiResumo;

    public Artigo(String nome, String nomeAutor, Integer qtPaginas, boolean possuiResumo) {
        this.nome = nome;
        this.nomeAutor = nomeAutor;
        this.qtPaginas = qtPaginas;
        this.possuiResumo = possuiResumo;
    }

    public void mostra(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Artigo{" +
                "nome='" + nome + '\'' +
                ", nomeAutor='" + nomeAutor + '\'' +
                ", qtPaginas=" + qtPaginas +
                ", possuiResumo=" + possuiResumo +
                '}';
    }
}
