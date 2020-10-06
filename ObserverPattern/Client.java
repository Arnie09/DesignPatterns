package ObserverPattern;

public class Client implements Observer{

    Client(){}

    @Override
    public void update(String operation) {
        System.out.println("Database was just updated with "+operation+" client side observer");        
    }
    
}
