package com.digitalbricklayer;

import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Artigo artigo = new Artigo(
                "Poo com o pedreiro",
                "TheDigitalBricklayer",
                1,
                false
        );

        artigo.mostra();

        ArtigoCientifico artigoCientifico = new ArtigoCientifico(
                "Poo com o pedreiro science",
                "TheDigitalBricklayer",
                1,
                true,
                Collections.singletonList("ORI"),
                true
        );
        artigoCientifico.mostra();
        artigoCientifico.publicar();

    }
}