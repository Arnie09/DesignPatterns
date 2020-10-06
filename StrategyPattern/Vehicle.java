package StrategyPattern;

public abstract class Vehicle {

    // this is the object of the strategy that we are going to use
    private GoAlgorithm goAlgorithm;

    // default contructor
    Vehicle(){

    }

    // sets which algorithm to use
    public void setGoAlgorithm(GoAlgorithm goAlgorithm){
        this.goAlgorithm = goAlgorithm;
    }

    // the main function that executes the algo
    public void go(){
        this.goAlgorithm.go();
    }
}
