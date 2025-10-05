package CreationalDesignPattern.SingletonPattern;

public class DatabaseConnection {
    private static DatabaseConnection instance = null;
    private DatabaseConnection() {

    }

    public DatabaseConnection getDatabaseConnectionInstance() {
        if(instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
}
