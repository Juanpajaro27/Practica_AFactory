package com.mycompany.abstract_factory;

public class RaceCar implements ICar{

    @Override
    public void Encender() {
        System.out.println("Se esta encendiendo el carro de carreras");
    }

    @Override
    public void Apagar() {
        System.out.println("Se esta apagando el carro de carreras");
    }

    @Override
    public void Arrancar() {
        System.out.println("Se esta arrancando el carro de carreras");
    }

    @Override
    public void Frenar() {
        System.out.println("Se esta frenando el carro de carreras");
    }
    
}
