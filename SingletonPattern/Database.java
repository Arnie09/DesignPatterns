package SingletonPattern;

public class Database {

    private static Database singleObject;
    private String name;
    private int records;

    private Database(String s){
        name = s;
        records = 0;
    }

    public static Database getInstance(String name){
        if ( singleObject == null ){
            singleObject = new Database(name);
        }

        return singleObject;
    }

    public int updateRecord(){
        records++;
        return records;
    }

    public String getDesc(){
        return name;
    }
    
}
