package vbyrgazov;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import vbyrgazov.model.Role;
import vbyrgazov.model.User;
import vbyrgazov.service.UserService;

import java.util.ArrayList;

@SpringBootApplication
public class SpringJwtApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringJwtApplication.class, args);
    }

    @Bean
    CommandLineRunner run(UserService userService) {
        return args -> {
            userService.saveRole(new Role(null, "ROLE_USER"));
            userService.saveRole(new Role(null, "ROLE_MANAGER"));
            userService.saveRole(new Role(null, "ROLE_ADMIN"));
            userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));

            userService.saveUser(new User(null, "Vladislav Byrgazov", "ex4ample", "qwert", new ArrayList<>()));
            userService.saveUser(new User(null, "Anna Byrgazova", "insendio", "qwert", new ArrayList<>()));
            userService.saveUser(new User(null, "Evgeniy Semenov", "fallen_azgard", "qwert", new ArrayList<>()));
            userService.saveUser(new User(null, "Natasha Melnik", "profcom", "qwert", new ArrayList<>()));

            userService.addRoleToUser("ex4ample", "ROLE_USER");
            userService.addRoleToUser("ex4ample", "ROLE_ADMIN");
            userService.addRoleToUser("ex4ample", "ROLE_SUPER_ADMIN");
            userService.addRoleToUser("insendio", "ROLE_USER");
            userService.addRoleToUser("insendio", "ROLE_ADMIN");
            userService.addRoleToUser("fallen_azgard", "ROLE_USER");
            userService.addRoleToUser("fallen_azgard", "ROLE_MANAGER");
            userService.addRoleToUser("profcom", "ROLE_USER");
        };
    }

}
