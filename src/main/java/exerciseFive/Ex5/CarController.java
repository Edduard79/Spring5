package exerciseFive.Ex5;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cars")
public class CarController {
    @GetMapping
    public ResponseEntity<CarDTO> getCar() {
        return ResponseEntity.ok(new CarDTO());
    }

    @PostMapping
    public ResponseEntity<String> createCar(@RequestBody CarDTO car) {
        System.out.println(car);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}