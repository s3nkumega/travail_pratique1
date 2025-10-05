import java.nio.file.*;
import java.nio.charset.StandardCharsets;

class FileLogger implements Logger {
    private final String path = "out/audit.log";

    @Override
    public void write(String message) {
        try {
            Path p = Path.of(path);
            if (p.getParent() != null) Files.createDirectories(p.getParent());
            Files.writeString(p, message + System.lineSeparator(), StandardCharsets.UTF_8,
                              StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            System.out.println("[FileLogger] " + p.toAbsolutePath());
        } catch (Exception e) {
            System.out.println("[FileLogger] " + e.getMessage());
        }
    }
}
