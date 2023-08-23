package com.digitalbricklayer.abstracaoheranca;

import java.util.List;

public class ArtigoCientifico extends Artigo {

    public List<String> referenciasBibliograficas;

    public boolean abnt;

    public ArtigoCientifico(String nome, String nomeAutor, Integer qtPaginas, boolean possuiResumo,
                            List<String> referenciasBibliograficas, boolean abnt) {
        super(nome, nomeAutor, qtPaginas, possuiResumo);
        this.referenciasBibliograficas = referenciasBibliograficas;
        this.abnt = abnt;
    }


    public void publicar() {
        System.out.println("Publicando");
    }

    @Override
    public String toString() {
        return "ArtigoCientifico{" +
                "abnt=" + abnt +
                ", nome='" + nome + '\'' +
                ", nomeAutor='" + nomeAutor + '\'' +
                ", qtPaginas=" + qtPaginas +
                ", possuiResumo=" + possuiResumo +
                ", abnt=" + abnt +
                ", referencias=" + referenciasBibliograficas +
                '}';
    }
}
