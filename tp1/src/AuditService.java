public class AuditService {
    private final Logger logger;

    public AuditService(Logger logger) {
        this.logger = logger;
    }

    public void audit(String event) {
        logger.write("out/audit.log", "AUDIT :: " + event);
    }

    public String dumpLog() {
        return logger.readAll("out/audit.log");
    }
}
