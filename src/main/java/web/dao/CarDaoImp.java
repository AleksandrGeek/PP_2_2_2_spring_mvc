package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao {



    private List<Car> carsList;

    public CarDaoImp() {
        carsList = new ArrayList<>();

        carsList.add(new Car("Mercedes-Benz", "S-Class", 2024));
        carsList.add(new Car("Mercedes-Benz", "E-Class", 2023));
        carsList.add(new Car("Mercedes-Benz", "C-Class", 2023));
        carsList.add(new Car("Mercedes-Benz", "GLE", 2024));
        carsList.add(new Car("Mercedes-Benz", "AMG GT", 2024));
    }


    @Override
    public List<Car> getAllCars() {
        return new ArrayList<>(carsList);
    }

    @Override
    public List<Car> getFirstNCars(int count) {
        List<Car> allCars = getAllCars();
        if (count <= 0) {
            return allCars;
        }
        if (count >= allCars.size()) {
            return allCars;
        }
        return allCars.subList(0, count);
    }
}

