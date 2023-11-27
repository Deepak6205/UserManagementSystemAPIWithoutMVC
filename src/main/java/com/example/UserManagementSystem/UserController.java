package com.example.UserManagementSystem;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    List<UserEntity> userList;

    //add user
    @PostMapping("user")
    public String addUser(@RequestBody UserEntity isUser) {
        userList.add(isUser);
        return "user is added";
    }

    //get user by userId

    @PostMapping("users")
    public String addUsers(@RequestBody ArrayList<UserEntity> isUsers) {
        userList.addAll(isUsers);
        return isUsers.size() + " users were added";
    }

    @GetMapping("user/{id}")
    public UserEntity getUserById(@PathVariable Integer id) {
        for (UserEntity user : userList) {
            if (user.getUserId().equals(id)) {

                return user;
            }
        }
        return null;

    }

    //get all users
    @GetMapping("users")
    public List<UserEntity> getAllUsers() {
        return userList;
    }

    //update user info: with id and address as well as phone number.

    @PutMapping("user/id/{id}/address/number")
    public String setUserStatusById(@PathVariable Integer id, @RequestParam String address, @RequestParam String number) {
        for (UserEntity user : userList) {
            if (user.getUserId().equals(id)) {
                user.setUserAddress(address);
                user.setUserNumber(number);
                return "user: " + id + "updated to " + address + " and with " + number;
            }
        }
        return "invalid id";
    }

    //delete user

    @DeleteMapping("user/id/{id}")
    public String deleteUser(@PathVariable Integer id){
        for(UserEntity user : userList){
            if(user.getUserId().equals(id)){
                userList.remove(user);
                return "user: " + id + " removed";
            }
        }
        return "invalid id";
    }
}

