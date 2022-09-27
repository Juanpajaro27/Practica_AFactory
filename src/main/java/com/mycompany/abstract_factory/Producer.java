package com.mycompany.abstract_factory;

public class Producer {

    public static AbstractFactory getVintageFactory(boolean Vintage){
        if(Vintage){
            return new VintageFactory();
        }
        return null;
    }
    
    public static AbstractFactory getRaceFactory(boolean Race){
        if(Race){
            return new RaceFactory();
        }
        return null;
    }
}
