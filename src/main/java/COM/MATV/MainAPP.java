package COM.MATV;

import org.h2.tools.Console;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.sql.SQLException;

@SpringBootApplication
@EnableJpaRepositories(basePackages="com.MATV")
public class MainAPP {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(MainAPP.class, args);
        try {
            Console.main(args);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
