package gt.edu.umg.ingenieria.auth.auth.controller;

import gt.edu.umg.sistemas.ingsoftware.hojatrabajo3.TokenService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Auth {

     @RequestMapping("auth")
    public void helloWorld(@RequestParam(value="user") String name, @RequestParam String password) {
        String token;
        TokenService f = new TokenService();
        token=f.createJWT(name, password);
        System.out.println();
        System.out.println(token);
        f.parseJWT(token);
    }
}
