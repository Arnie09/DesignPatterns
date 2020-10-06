package ObserverPattern;

public class Admins implements Observer{

    @Override
    public void update(String operation) {
        System.out.println("Database was just updated with "+operation+" admin side observer");
    }
    
}
