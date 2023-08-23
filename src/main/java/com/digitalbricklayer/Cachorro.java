package com.digitalbricklayer;

public class Cachorro extends Animal {

    boolean bravo = false;

    public void latir() {
        System.out.println("Estou latindo");
    }

    @Override
    public void anda() {
        System.out.println("Eu sou um cachorro e estou andando.");
    }

    public void corre() {
        System.out.println("Estou correndo e sou feliz");
    }

    public void corre(boolean bravo) {
        System.out.println("Estou correndo :: " + (bravo ? "bravo" : "feliz"));
    }

    public void corre(String nome) {
        System.out.println("Estou corrrendo atras da pessoa " + nome);
    }

    @Override
    public boolean extinto() {
        return false;
    }
}
