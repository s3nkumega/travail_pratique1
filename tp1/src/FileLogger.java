import java.nio.file.*;
import java.nio.charset.StandardCharsets;

public class FileLogger implements Logger {
    @Override
    public void write(String path, String msg) {
        try {
            Path p = Path.of(path);
            if (p.getParent() != null) Files.createDirectories(p.getParent());
            Files.writeString(p, msg + System.lineSeparator(),
                StandardCharsets.UTF_8, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            System.out.println("[FileLogger] wrote -> " + p.toAbsolutePath());
        } catch (Exception e) {
            System.out.println("[FileLogger] write error: " + e.getMessage());
        }
    }

    @Override
    public String readAll(String path) {
        try {
            return Files.readString(Path.of(path), StandardCharsets.UTF_8);
        } catch (Exception e) {
            System.out.println("[FileLogger] read error: " + e.getMessage());
            return "";
        }
    }
}
