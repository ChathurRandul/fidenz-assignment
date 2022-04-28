package com.fidenz.test.dao.custom.impl;

import com.fidenz.test.dao.CrudDAOImpl;
import com.fidenz.test.dao.custom.UserDAO;
import com.fidenz.test.entity.User;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDAOImpl extends CrudDAOImpl<User, String> implements UserDAO {

    @Override
    public List<User> getUsersByName(String name) {
        String hql = "FROM User u WHERE u.name = :name";
        Query query = getSession().createQuery(hql);
        query.setParameter("name", name);
        return (List<User>) query.list();
    }

    @Override
    public List<User> getUsersByZipCode(String zipCode) {
        String hql = "FROM User u WHERE u.address__zipcode = :zipCode GROUP BY u.address__zipcode";
        Query query = getSession().createQuery(hql);
        query.setParameter("zipCode", zipCode);
        return (List<User>) query.list();
    }
}
