// this is the subjects interface and any object who wants to add observers
// needs to implement this class

package ObserverPattern;

public interface Subject {
    public void addObserver(Observer o);
    public void notifyObservers();
    public void deleteObserver(Observer o);
}
