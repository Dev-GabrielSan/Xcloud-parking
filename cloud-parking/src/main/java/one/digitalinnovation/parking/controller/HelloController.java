package one.digitalinnovation.parking.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping
    public String printHello(){
        return "olá  ";
    }
}
