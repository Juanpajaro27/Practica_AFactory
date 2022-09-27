package com.mycompany.abstract_factory;

public class VintageBike implements IBike {

    @Override
    public void pedalear() {
        System.out.println("Se esta pedalenando en la bicicleta vintage");
    }

    @Override
    public void frenar() {
        System.out.println("Se esta frenando la bici vintage");
    }
    
}
