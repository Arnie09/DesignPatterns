package AdapterPattern;

public class NameToNewNameAdapter implements NewNameInterface{

    public NameClass nameClassObj;
    String fn, ln;

    NameToNewNameAdapter(NameClass nameClassObj){
        this.nameClassObj = nameClassObj;
        fn = this.nameClassObj.getName().split(" ")[0];
        ln = this.nameClassObj.getName().split(" ")[1];
    }


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
