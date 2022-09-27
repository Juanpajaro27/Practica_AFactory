package com.mycompany.abstract_factory;

public class Abstract_Factory {

    public static void main(String[] args) {
        
        AbstractFactory VintageFactory = Producer.getVintageFactory(true);
        ICar car2 = VintageFactory.getCar("VintageCar");
        car2.Encender();
        car2.Arrancar();
        car2.Frenar();
        car2.Frenar();
        
        AbstractFactory RaceFactory = Producer.getRaceFactory(true);
        ICar car3 = RaceFactory.getCar("RaceCar");
        car3.Encender();
        car3.Arrancar();
        car3.Frenar();
        car3.Frenar();
    }
}
