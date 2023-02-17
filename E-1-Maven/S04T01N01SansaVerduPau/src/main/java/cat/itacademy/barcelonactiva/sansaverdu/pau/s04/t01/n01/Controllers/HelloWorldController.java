package cat.itacademy.barcelonactiva.sansaverdu.pau.s04.t01.n01.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping(value = "HelloWorld")
    public String saludo1(@RequestParam(defaultValue = "Jon Snow") String nom) {
        return "Hola " + nom + ". Estàs executant un projecte Maven";
    }

    @RequestMapping(value="HelloWorld2")
    public  String saludo2(@RequestParam(defaultValue = "Jon Snow") String nom) {
        return "Hola " + nom + ". Estàs executant un projecte Maven";
    }
}
