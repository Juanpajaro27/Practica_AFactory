package com.mycompany.abstract_factory;

public class RaceBike implements IBike{

    @Override
    public void pedalear() {
        System.out.println("Se esta pedalenando en la bicicleta de carreras");
    }

    @Override
    public void frenar() {
        System.out.println("Se esta frenando la bici de carreras");
    }
    
}
