public class Consolelogger implements Logger {
    @Override
    public void write(String message) {
        System.out.println("[ConsoleLogger] " + message);
    }

}
