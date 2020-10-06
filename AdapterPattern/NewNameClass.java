package AdapterPattern;

public class NewNameClass implements NewNameInterface{

    String fn, ln;

    @Override
    public void setFrstName(String fn) {
        this.fn = fn;
    }

    @Override
    public void setLastName(String ln) {
        this.ln = ln;
    }

    @Override
    public String getFrstName() {
        return fn;
    }

    @Override
    public String getLastName() {
        return ln;
    }
    
}
