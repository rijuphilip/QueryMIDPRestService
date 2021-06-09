package midpuri.exception;

import org.springframework.boot.ExitCodeGenerator;

public class ExitException extends RuntimeException implements ExitCodeGenerator {
    private static final long serialVersionUID = 1L;
    private static final int EXIT_CODE = 10;

    @Override
    public int getExitCode() {
        return EXIT_CODE;
    }
}
