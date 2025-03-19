package Kata.Academy.PreProject.dao;



import Kata.Academy.PreProject.model.User;

import java.util.List;

public interface UserDao {
    public List<User> getAllUsers();

    public User getUserById(int id);

    public void save(User user);

    public void update(User user);

    public void delete(int id);
}
