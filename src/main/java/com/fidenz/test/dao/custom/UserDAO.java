package com.fidenz.test.dao.custom;

import com.fidenz.test.dao.CrudDAO;
import com.fidenz.test.entity.User;

import java.util.List;

public interface UserDAO extends CrudDAO<User, String> {
    
    List<User> getUsersByName(String name);

    List<User> getUsersByZipCode(String zipCode);
}
