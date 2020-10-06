package StrategyPattern;

public class Planes extends Vehicle{
    
    Planes(){
        setGoAlgorithm(new GoByFlyingAlgorithm());
    }
}
