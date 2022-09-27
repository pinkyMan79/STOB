package ru.terenin.supertestobench.repositories;

import ru.terenin.supertestobench.model.User;

import java.util.List;

public interface UserRepository {

    List<User> findAll();

    User findById(Long id);

    void save(User u);

    void update(User u);

    void delete(Long id);

}
