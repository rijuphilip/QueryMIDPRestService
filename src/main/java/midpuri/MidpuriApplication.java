package midpuri;

import midpuri.exception.ExitException;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MidpuriApplication implements CommandLineRunner {

    public static void main(String[] args) {
        new SpringApplication(MidpuriApplication.class).run(args);
    }

    @Override
    public void run(String... arg0) {
        if (arg0.length > 0 && arg0[0].equals("exitcode")) {
            throw new ExitException();
        }
    }
}
