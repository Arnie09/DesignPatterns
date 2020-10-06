package StrategyPattern;

public class Cars extends Vehicle{

    Cars(){
        setGoAlgorithm(new GoByDrivingAlgorithm());
    }
}
    

