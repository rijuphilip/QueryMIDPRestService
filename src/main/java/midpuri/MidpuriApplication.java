package midpuri;

import com.fasterxml.jackson.databind.ObjectMapper;
import midpuri.exception.ExitException;
import midpuri.rest.JAXBElementMixIn;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import javax.xml.bind.JAXBElement;

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

    @Bean
    @Primary
    public ObjectMapper objectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.addMixIn(JAXBElement.class, JAXBElementMixIn.class);
        return objectMapper;
    }
}
