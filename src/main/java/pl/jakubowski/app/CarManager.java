package pl.jakubowski.app;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarManager {

    private List<Car> carList;

    public CarManager(){
        this.carList = new ArrayList<>();
        carList.add(new Car("VW","polo"));
        carList.add(new Car("BMW","5"));
    }
    public boolean addCar(Car car){
        return carList.add(car);
    }
    public List<Car> getCarList() {
        return carList;
    }
}
