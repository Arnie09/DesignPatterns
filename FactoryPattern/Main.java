package FactoryPattern;

public class Main {

    public static void main(String args[]){

        Factory factory1 = new Factory("MySQL");
        Connection mySQLConn = factory1.createConnection();
        mySQLConn.description();

        Factory factory2 = new Factory("Oracle");
        Connection oracleConn = factory2.createConnection();
        oracleConn.description();
    }
    
}
