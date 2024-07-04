package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.Car;
import web.repos.CarRepos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class CarServiceImpl implements CarService{

    private final CarRepos carRepos;

    @Autowired
    public CarServiceImpl(CarRepos carRepos) {
        this.carRepos = carRepos;
    }

    @Override
    public List<Car> getCars(int count) {
        return carRepos.getCarsByCount(count);
    }
}
