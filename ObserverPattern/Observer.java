
// this is the observer interface. Any objects who want to observe 
// needs to implement this class

package ObserverPattern;

public interface Observer {
    public void update(String operation);
}
