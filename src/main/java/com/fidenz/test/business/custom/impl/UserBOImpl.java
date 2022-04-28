package com.fidenz.test.business.custom.impl;

import com.fidenz.test.business.custom.UserBO;
import com.fidenz.test.dao.custom.UserDAO;
import com.fidenz.test.dto.UserDTO;
import com.fidenz.test.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional
@Component
public class UserBOImpl implements UserBO {

    @Autowired
    private UserDAO userDAO;

    @Override
    public void saveUser(UserDTO user) {
        userDAO.save(setUser(user));
    }

    @Override
    public void updateUser(UserDTO user) {
        userDAO.update(setUser(user));
    }

    @Override
    public void deleteUser(String id) {
        userDAO.delete(id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<UserDTO> findAllUsers() {
        List<User> allUsers = userDAO.findAll();
        List<UserDTO> dtos = new ArrayList<>();
        for (User user : allUsers) {
            dtos.add(setDTO(user));
        }
        return dtos;
    }

    @Transactional(readOnly = true)
    @Override
    public UserDTO findUser(String id) {
        User user = userDAO.find(id);
        return setDTO(user);
    }

    @Transactional(readOnly = true)
    @Override
    public List<UserDTO> getUsersByName(String name) {
        List<User> allUsers = userDAO.getUsersByName(name);
        List<UserDTO> dtos = new ArrayList<>();
        for (User user : allUsers) {
            dtos.add(setDTO(user));
        }
        return dtos;
    }

    @Transactional(readOnly = true)
    @Override
    public List<UserDTO> getUsersByZipCode(String zipCode) {
        List<User> alUsers = userDAO.getUsersByZipCode(zipCode);
        List<UserDTO> dtos = new ArrayList<>();
        for (User user : alUsers) {
            dtos.add(setDTO(user));
        }
        return dtos;
    }

    public UserDTO setDTO(User user) {
        return new UserDTO(user.getId(), user.getIndex(), user.getAge(), user.getEyeColor(), user.getName(), user.getGender(),
                user.getCompany(), user.getEmail(), user.getPhone(), user.getAddress__number(), user.getAddress__street(), user.getAddress__city(),
                user.getAddress__state(), user.getAddress__zipcode(), user.getAbout(), user.getRegistered(), user.getLongitude(), user.getLatitude(),
                user.getTags__001(), user.getTags__002(), user.getTags__003(), user.getTags__004(), user.getTags__005(), user.getTags__006(), user.getTags__007());
    }

    public User setUser(UserDTO user) {
        return new User(user.getId(), user.getIndex(), user.getAge(), user.getEyeColor(), user.getName(), user.getGender(),
                user.getCompany(), user.getEmail(), user.getPhone(), user.getAddress__number(), user.getAddress__street(), user.getAddress__city(),
                user.getAddress__state(), user.getAddress__zipcode(), user.getAbout(), user.getRegistered(), user.getLongitude(), user.getLatitude(),
                user.getTags__001(), user.getTags__002(), user.getTags__003(), user.getTags__004(), user.getTags__005(), user.getTags__006(), user.getTags__007());
    }
}
