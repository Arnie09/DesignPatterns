package StrategyPattern;

public class Main {
    
    public static void main(String args[]){

        Cars car1 = new Cars();
        
        car1.go();

        Planes plane1 = new Planes();
        plane1.go();

        // dynamically switching the algorithm used
        plane1.setGoAlgorithm(new GoByDrivingAlgorithm());
        plane1.go();

    }

}
