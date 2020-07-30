package hiber.service;

import hiber.dao.UserDaoImp;
import hiber.model.Car;
import hiber.model.User;

import java.util.List;

public interface UserService {
    void add(User user);

    List<User> listUsers();

    void add(Car car);

    User getUserByCar(String nameCar, int series);
}
