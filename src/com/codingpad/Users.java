package com.codingpad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Users {
    private String name;
    private int id;

    public Users(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    Users john = new Users("John P.", 15);
    Users sarah = new Users("Sarah M.", 20);
    Users charles = new Users("Charles B.", 31);
    Users mary = new Users("Mary T.", 9);

    List<Users> usersList = new ArrayList<>(Arrays.asList(john, sarah, charles, mary));

    List<Users> usersIdLargerThanTen = usersList
            .stream()
            .filter(c -> c.getId() > 10)
            .collect(Collectors.toList());



}
