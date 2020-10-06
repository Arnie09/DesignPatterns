package ObserverPattern;

public class Main {
    
    public static void main(String args[]){

        Database db = new Database();
        Client clnt1 = new Client();
        Admins admn1 = new Admins();

        db.addObserver(clnt1);

        db.addTransaction("Create row id");

        db.deleteObserver(clnt1);
        db.addObserver(admn1);

        db.addTransaction("Add data for client 1");

        db.addObserver(clnt1);
        db.addTransaction("End of transaction");
    }

}
