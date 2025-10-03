public class InMemoryDatabase implements Database {
    public void save(String data) {
        System.out.println("InMemory: " + data);
    }
}
