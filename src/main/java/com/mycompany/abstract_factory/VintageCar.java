package com.mycompany.abstract_factory;

public class VintageCar implements ICar{

    @Override
    public void Encender() {
        System.out.println("Se esta encendiendo el carro vintage");
    }

    @Override
    public void Apagar() {
        System.out.println("Se esta apagando el carro vintage");
    }

    @Override
    public void Arrancar() {
        System.out.println("Se esta arrancando el carro vintage");
    }

    @Override
    public void Frenar() {
        System.out.println("Se esta frenando el carro vintage");
    }
    
}
