package com.digitalbricklayer;

import com.digitalbricklayer.abstracaoheranca.Artigo;
import com.digitalbricklayer.abstracaoheranca.ArtigoCientifico;
import com.digitalbricklayer.encaspulamento.Gerente;

public class Main {
    public static void main(String[] args) throws Exception {
        Gerente gerente = new Gerente();
        gerente.setMultiplicadorCargo(- 10.0);
        gerente.setSalarioBase( 5000.0);
        System.out.println(gerente.calculaSalario());

        ArtigoCientifico artigoCientifico  = new ArtigoCientifico();

        artigoCientifico.nome
    }
}