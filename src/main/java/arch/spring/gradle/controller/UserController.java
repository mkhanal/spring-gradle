package arch.spring.gradle.controller;

import arch.spring.gradle.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;


@Controller
public class UserController {

    @RequestMapping(value = "/user/{id}", method = GET, produces = "application/json")
    public User get(@PathVariable("id") String userId) {
        User user = new User(userId);
        return user.fetchData();
    }
}
