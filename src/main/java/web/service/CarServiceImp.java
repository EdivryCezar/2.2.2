package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {
    private final List<Car> carList;

    public CarServiceImp() {
        carList = new ArrayList<>();
        carList.add(new Car(1, "tesla", 78));
        carList.add(new Car(2, "bmw", 53));
        carList.add(new Car(3, "marrusia", 60));
        carList.add(new Car(4, "moskvich", 77));
        carList.add(new Car(5, "jiguli", 05));
    }

    @Override
    public List<Car> listAllCars(int count) {
        return carList.stream().limit(count).toList();
    }

}
