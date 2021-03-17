package com.example.testtask.rest;

import com.example.testtask.rest.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.testtask.domain.User;
import com.example.testtask.repository.UserRepository;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class UserController {

    private final UserRepository repository;

    @Autowired
    public UserController(UserRepository repository) {
        this.repository = repository;
    }

    //1) Добавление нового пользователя
    @PostMapping("/api/createuser")
    public void createUser(@RequestBody User user) {
        repository.save(user);
    }

    //2) Получение списка всех пользователей (только ID, username и ФИО)
    @GetMapping("/api/users")
    public List<UserDto> getAllUsers() {
        return repository.findAll().stream().map(UserDto::toDto)
                .collect(Collectors.toList());
    }

    //3) Получение всех данных о пользователе по ID
    @GetMapping("/api/users/{id}")
    public User getUserById(@PathVariable int id) {
        return repository.findById(id);
    }

}
