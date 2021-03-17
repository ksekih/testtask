package com.example.testtask.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.testtask.domain.User;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Integer> {

    List<User> findAll();

    User findById(int id);


}
