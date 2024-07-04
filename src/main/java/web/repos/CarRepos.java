package web.repos;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.List;

@Repository
public class CarRepos {

    List<Car> cars = List.of(
            new Car("BMW", 1, "rad"),
            new Car("Audi",2, "green"),
            new Car("Mercedes",3, "black"),
            new Car("Honda",4, "yelow"),
            new Car("Audi", 5, "white")
    );
    public List<Car> getCarsByCount(int count) {
        return cars.stream().limit(count).toList();
    }
}
