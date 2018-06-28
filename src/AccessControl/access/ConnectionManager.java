package AccessControl.access;

import javax.swing.text.StyledEditorKit;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;

class Connection{
    private static int count = 0;
    private Connection(){};

    static Connection makeConnection(){
        return new  Connection();
    }
    public static int howMany(){
        return count;
    }
}
public class ConnectionManager {
    static int howManyLeft = 3;
    static Connection[] ca = new Connection[3];{
        for(Connection x : ca){
            x=Connection.makeConnection();
        }

    }
    static Connection getConnection(){
        if (howManyLeft > 0) {
            return ca[--howManyLeft];
        }else{
            System.out.println("no more Connection");
            return null;
        }
    }

    public static void main(String[] args) {
        ConnectionManager connectionManager = new ConnectionManager();
        System.out.println(connectionManager.howManyLeft);
        connectionManager.getConnection();
        System.out.println(connectionManager.howManyLeft);
        connectionManager.getConnection();
        System.out.println(connectionManager.howManyLeft);
        connectionManager.getConnection();
        System.out.println(connectionManager.howManyLeft);
        connectionManager.getConnection();
        System.out.println(connectionManager.howManyLeft);
    }
}
