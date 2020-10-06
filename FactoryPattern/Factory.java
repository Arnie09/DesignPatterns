package FactoryPattern;

public class Factory {
    
    private String type;
    
    Factory(String type){
        this.type  = type;
    }

    public Connection createConnection(){
        if (type.equals("Oracle")){
            return new OracleConnection();
        }
        else if (type.equals("MySQL")){
            return new MySQLConnection();
        }
        else
            return new MySQLConnection();
    }


}
