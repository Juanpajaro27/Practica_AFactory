package com.mycompany.abstract_factory;

public class RaceFactory extends AbstractFactory {

    @Override
    public IBike getBike(String BikeType) {
        if(BikeType.equalsIgnoreCase("RaceBike")){
            return new RaceBike();
        }
        return null;
    }

    @Override
    public ICar getCar(String CarType) {
        if(CarType.equalsIgnoreCase("RaceCar")){
            return new RaceCar();
        }
        return null;
    }
    
}
