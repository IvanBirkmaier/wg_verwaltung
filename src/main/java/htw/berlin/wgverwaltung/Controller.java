package htw.berlin.wgverwaltung;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Controller {

    @RequestMapping("/helloWorld")
    public String index() {
        return "Der dumme Nico ist nicht nett, steht sogar im Inernet! HAHAHA";
    }

}

    @RequestMapping("/ivan")
    public String index1() {
        return "PIMP";
    }

}
