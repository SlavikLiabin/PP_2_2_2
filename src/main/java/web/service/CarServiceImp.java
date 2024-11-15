package web.service;

import web.model.Car;
import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImp implements CarService {

    private final List<Car> carsList = List.of(
            new Car(1, "Audi", "black"),
            new Car(2, "BMW", "white"),
            new Car(3, "Mercedes", "green"),
            new Car(4, "Toyota", "blue"),
            new Car(5, "Honda", "brown")
    );

    @Override
    public List<Car> getListсount(int count) {
        if (count <= 0 || count > carsList.size()) {
            return carsList;
        }
        return carsList.stream().limit(count).collect(Collectors.toList());
    }
}
