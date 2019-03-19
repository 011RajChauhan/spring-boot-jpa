package com.raj.jpa.jpapractise.services;

import com.raj.jpa.jpapractise.entities.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class UserServiceDao {

    //enitity manager interface
    @PersistenceContext
    private EntityManager entityManager;

    public long insert(User user){
        entityManager.persist(user);
        return  user.getId();
    }
}
