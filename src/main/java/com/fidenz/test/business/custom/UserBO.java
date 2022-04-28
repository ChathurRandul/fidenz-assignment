package com.fidenz.test.business.custom;

import com.fidenz.test.business.SuperBO;
import com.fidenz.test.dto.UserDTO;

import java.util.List;

public interface UserBO extends SuperBO {

    void saveUser(UserDTO user);

    void updateUser(UserDTO user);

    void deleteUser(String id);

    List<UserDTO> findAllUsers();

    UserDTO findUser(String id);

    List<UserDTO> getUsersByName(String name);

    List<UserDTO> getUsersByZipCode(String zipCode);
}
