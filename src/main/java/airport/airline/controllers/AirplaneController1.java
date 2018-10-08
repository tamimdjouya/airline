package airport.airline.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/airplane")
public class AirplaneController1 {
    @RequestMapping("/")

    public String index(Map<String, Object> model){
        model.put("title", "Airplane");
        return "index";
    }
}
