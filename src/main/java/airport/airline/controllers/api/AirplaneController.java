package airport.airline.controllers.api;

import airport.airline.models.Airplane;
import airport.airline.repositories.AirplaneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/airplane")
public class AirplaneController {

    @Autowired
    private AirplaneRepository airplaneRepository;

    @RequestMapping(method = RequestMethod.POST)
    public Airplane create(@RequestBody Airplane airplane) {
        this.airplaneRepository.save(airplane);
        return airplane;
    }

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Airplane> getAll(){
        return airplaneRepository.findAll();
    }
}
