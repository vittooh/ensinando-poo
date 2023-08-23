package com.digitalbricklayer;

public class Gato extends Animal {

    public boolean antiSocial = true;

    public void mia(){
        System.out.println("Estou miando");
    }

    @Override
    public void anda() {
        System.out.println("eu sou um gato e estou andando");
    }

    @Override
    public boolean extinto() {
        return false;
    }
}
