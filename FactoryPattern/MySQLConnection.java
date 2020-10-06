package FactoryPattern;

public class MySQLConnection extends Connection {
    MySQLConnection(){}

    public void description(){
        System.out.println("This is My SQL Conn");
    }
}