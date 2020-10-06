package AdapterPattern;

public class NameClass implements NameInterface{
    
    String s;

    NameClass(){
        s = "";
    }

    public void setName(String s){
        this.s = s;
    }

    public String getName(){
        return s;
    }

}
