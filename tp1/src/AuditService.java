public class AuditService {
     private final Logger logger;

    public AuditService(Logger logger) {
        this.logger = logger;  // Injection de dépendance
    }

    public void audit(String event) {
        logger.write("AUDIT :: " + event);
    }
}
