package StatePattern;

public class Context {
    
    State state;

    Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public String getState(){
        return this.state.toString();
    }

}
