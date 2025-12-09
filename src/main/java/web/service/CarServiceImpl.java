package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;


@Service
public class CarServiceImpl implements CarService {

    private List<Car> carsList;

    public CarServiceImpl () {
        carsList = new ArrayList<>();

        carsList.add(new Car("Mercedes-Benz", "S-Class", 2024));
        carsList.add(new Car("Mercedes-Benz", "E-Class", 2023));
        carsList.add(new Car("Mercedes-Benz", "C-Class", 2023));
        carsList.add(new Car("Mercedes-Benz", "GLE", 2024));
        carsList.add(new Car("Mercedes-Benz", "AMG GT", 2024));
    }


    @Override

public List<Car> getCars(int count) {
        if (count <= 0 || count >= 5) {
            return carsList;
        }
        return carsList.subList(0,count);
    }
}

