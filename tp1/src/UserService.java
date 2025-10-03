public class UserService {

    private Database db;

    public UserService(Database db) { this.db = db;}

    public void register(String user) { db.save(user); }
}
