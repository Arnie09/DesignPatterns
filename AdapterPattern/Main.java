package AdapterPattern;

public class Main {
    
    public static void main(String args[]){
        NameClass nameClass = new NameClass();
        nameClass.setName("Arnab Chanda");

        NameToNewNameAdapter nameToNewNameAdapter = new NameToNewNameAdapter(nameClass);
        System.out.println("First name: "+ nameToNewNameAdapter.getFrstName());
        System.out.println("Last name: "+ nameToNewNameAdapter.getLastName());
        
    }
}
