package ru.terenin.supertestobench.mappers;

import ru.terenin.supertestobench.dto.UserSignIn;
import ru.terenin.supertestobench.model.User;

import java.util.function.Function;

public class Mappers {

    public static Function<UserSignIn, User> fromFormToUser = sign
             -> User.builder()
            .email(sign.getEmail())
            .nickname(sign.getNickname())
            .password(sign.getPassword())
            .build();

}
