package com.mycompany.abstract_factory;

public class VintageFactory extends AbstractFactory {

    @Override
    public IBike getBike(String BikeType) {
        if(BikeType.equalsIgnoreCase("VintageBike")){
            return new VintageBike();
        }
        return null;
    }

    @Override
    public ICar getCar(String CarType) {
        if(CarType.equalsIgnoreCase("VintageCar")){
            return new VintageCar();
        }
        return null;
    }
    
}
