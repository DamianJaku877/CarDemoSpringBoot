package pl.jakubowski.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarApi {

    private CarManager carManager;

    @Autowired
    public CarApi(CarManager carManager) {
        this.carManager = carManager;
    }

    @GetMapping("/getCars")
    public List<Car> getCars(){
        return carManager.getCarList();
    }

    @PostMapping("/addCar")
    public boolean addCar(@RequestBody Car car){
        return carManager.addCar(car);
    }
}
