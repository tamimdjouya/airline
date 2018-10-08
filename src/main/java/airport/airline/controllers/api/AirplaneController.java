package airport.airline.controllers.api;

import airport.airline.models.Airplane;
import airport.airline.repositories.AirplaneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

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

    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void delete(@PathVariable int id) {
        airplaneRepository.deleteById(id);
    }
}
