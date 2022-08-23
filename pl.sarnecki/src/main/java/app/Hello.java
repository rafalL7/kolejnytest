package app;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Hello {
    @GetMapping("/sayHello")
    public String sayhello(){
        return "hello";
    }
}
