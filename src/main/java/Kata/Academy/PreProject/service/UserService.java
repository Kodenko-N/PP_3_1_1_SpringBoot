package Kata.Academy.PreProject.service;



import Kata.Academy.PreProject.model.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();

    public User getUserById(int id);

    public void save(User user);

    public void update(User user);

    public void delete(int id);

}
