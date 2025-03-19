package Kata.Academy.PreProject.dao;

import Kata.Academy.PreProject.model.User;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;


@Repository
public class UserDaoImp implements UserDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> getAllUsers() {
        return entityManager.createQuery("select u from User u", User.class).getResultList();
    }

    public User getUserById(int id) {
        return entityManager.find(User.class, id);
    }

    public void save(User user) {
        System.out.println("Saving user" + user.toString());
        entityManager.persist(user);
    }

    @Transactional
    @org.springframework.transaction.annotation.Transactional
    public void update(User user) {
        System.out.println("Updating user" + user.toString());
        entityManager.merge(user);
    }

    public void delete(int id) {
        entityManager.remove(entityManager.find(User.class, id));
    }
}