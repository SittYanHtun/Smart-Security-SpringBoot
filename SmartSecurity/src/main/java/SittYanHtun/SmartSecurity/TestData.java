package SittYanHtun.SmartSecurity;

import SittYanHtun.SmartSecurity.models.Accounts;
import SittYanHtun.SmartSecurity.repository.LoginRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class TestData {

    @Bean
    CommandLineRunner commandLineRunner(LoginRepository repository) {
        return args -> {
            Accounts acc1 = new Accounts(
                    LocalDate.of(2023, OCTOBER, 13),
                    "Sitt Yan Htun",
                    LocalDate.of(2002, MARCH, 15),
                    "user",
                    "sittyanhtun@gmail.com",
                    "password",
                    "09956612067",
                    "somethings will be here"

            );
            Accounts acc2 = new Accounts(
                    LocalDate.of(2023, OCTOBER, 13),
                    "Khin Yadanar Thein",
                    LocalDate.of(2000, SEPTEMBER, 11),
                    "user",
                    "khinyadanarthein718@gmail.com",
                    "password",
                    "09970486023",
                    "somethings will be here tooo."

            );
            repository.saveAll(List.of(acc1, acc2));
        };
    }
}
