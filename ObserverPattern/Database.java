
// in this example database acts as the class that maintains the observers

package ObserverPattern;

import java.util.*;

public class Database implements Subject{

    List<Observer> listOfObservers;
    String action;

    Database(){
        listOfObservers = new ArrayList<>();
    }

    public void addTransaction(String a){
        action = a;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer o) {
        listOfObservers.add(o);
    }

    @Override
    public void notifyObservers() {

        for(int i = 0; i < listOfObservers.size(); i++){
            Observer o = listOfObservers.get(i);
            o.update(action);
        }
    }

    @Override
    public void deleteObserver(Observer o) {
        listOfObservers.remove(o);
    }
        
}
