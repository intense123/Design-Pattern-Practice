package dal;
/**
 * Singleton, so that only one instance/object can be created
 */

public class userdb {

    private static userdb instance;
    private userdb(){
        //makes the constructor private
    }

    public static synchronized userdb getInstance(){
        if(instance == null){
            instance =  new userdb();
        }
        return instance;
    }
    
}
