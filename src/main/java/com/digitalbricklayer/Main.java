package com.digitalbricklayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Gato gato = new Gato();
        Cachorro cachorro = new Cachorro();

        List<Animal> animais = new ArrayList<>();
        animais.add(gato);
        animais.add(cachorro);

        for (Animal animal : animais){
            animal.anda();
            if (animal instanceof  Cachorro){
                 cachorro.corre();
                 cachorro.corre(false);
                 cachorro.corre("DBL");
            }
        }

        for (Animalia animalia : animais){
            System.out.println(animalia.extinto());
        }


    }
}