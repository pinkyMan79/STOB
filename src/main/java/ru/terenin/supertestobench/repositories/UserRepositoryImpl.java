package ru.terenin.supertestobench.repositories;

import com.example.demo1.model.User;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.function.Function;

public class UserRepositoryImpl implements UserRepository {


    // да, можно было через JDBCTemplate, но это всё-таки спринговая фича, так что не в этот раз
    private final DataSource dataSource;

    public UserRepositoryImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    private static final Function<ResultSet, User> mapper = row -> {

        try {

            Long id = row.getLong("id");
            String email = row.getString("email");
            String nickname = row.getString("nickname");
            String password = row.getString("pass");

            return User.builder().id(id).email(email).nickname(nickname).password(password).build();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    };

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User findById(Long id) {
        return null;
    }

    @Override
    public void save(User u) {

    }

    @Override
    public void update(User u) {

    }

    @Override
    public void delete(Long id) {

    }

    public DataSource getDataSource() {
        return dataSource;
    }
}
