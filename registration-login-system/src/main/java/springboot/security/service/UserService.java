package springboot.security.service;

import springboot.security.dto.UserDto;
import springboot.security.entities.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
