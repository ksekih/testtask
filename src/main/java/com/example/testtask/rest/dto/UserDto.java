package com.example.testtask.rest.dto;

import com.example.testtask.domain.User;

public class UserDto {

    private int id;
    private String username;
    private String fio;

    public UserDto() {
    }

    public UserDto(int id, String username, String fio) {
        this.id = id;
        this.username = username;
        this.fio = fio;
    }

    public static UserDto toDto(User user) {
        return new UserDto(user.getId(), user.getUsername(), user.getFio());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }
}
