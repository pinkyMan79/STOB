package ru.terenin.supertestobench.repositories;

import com.example.demo1.model.User;

import java.util.List;

public interface UserRepository {

    List<User> findAll();

    User findById(Long id);

    void save(User u);

    void update(User u);

    void delete(Long id);

}
