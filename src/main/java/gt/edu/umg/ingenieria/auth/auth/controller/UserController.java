package gt.edu.umg.ingenieria.auth.auth.controller;


import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import gt.edu.umg.sistemas.ingsoftware.hojatrabajo3.entity.User;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
public class UserController {

    @PostMapping("user")
    public User login(@RequestParam("user") String username, @RequestParam("password") String pwd) {
    User user1=new User();
    user1.setUser(username);
    return user1;
    }
}
