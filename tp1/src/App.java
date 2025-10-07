public class App {
    public static void main(String[] args) throws Exception {
        Logger logger;

        if (args.length > 0 && args[0].equalsIgnoreCase("file")) {
            logger = new FileLogger();
        } else {
            logger = new Consolelogger();
        }

        AuditService auditService = new AuditService(logger);

        auditService.audit("USER_LOGIN");
        auditService.audit("USER_LOGOUT");
    }
}
