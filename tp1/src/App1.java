public class App1 {
    public static void main(String[] args) {
        Database mysql = new MySQLDatabase();
        Database memory = new InMemoryDatabase();

        UserService s1 = new UserService(mysql);
        s1.register("alice");

        UserService s2 = new UserService(memory);
        s2.register("bob");
    }
}