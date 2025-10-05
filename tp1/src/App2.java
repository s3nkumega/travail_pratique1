public class App2 {
    public static void main(String[] args) {
        AuditService svc = new AuditService(new FileLogger());
        svc.audit("USER_LOGIN");
        svc.audit("USER_DOWNLOAD");

        System.out.println("----LOG CONTENT----");
        System.out.println(svc.dumpLog());
        System.out.println("---------------------");
    }
}
