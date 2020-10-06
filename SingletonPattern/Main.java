package SingletonPattern;

public class Main {
    
    public static void main(String args[]){
        Database db1 = Database.getInstance("Database 1");
        Database db2 = Database.getInstance("Database 2");

        System.out.println(db1.updateRecord());
        System.out.println(db1.updateRecord());
        System.out.println(db1.updateRecord());
    
        System.out.println(db2.updateRecord());
    }
}
