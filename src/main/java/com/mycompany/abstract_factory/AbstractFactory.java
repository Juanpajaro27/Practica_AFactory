package com.mycompany.abstract_factory;

public abstract class AbstractFactory {
    
    public abstract IBike getBike(String BikeType);
    public abstract ICar getCar(String CarType);
    
}
