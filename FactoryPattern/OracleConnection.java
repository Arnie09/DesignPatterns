package FactoryPattern;

public class OracleConnection extends Connection{
    OracleConnection(){}

    public void description(){
        System.out.println("This is Oracle Conn");
    }
}
