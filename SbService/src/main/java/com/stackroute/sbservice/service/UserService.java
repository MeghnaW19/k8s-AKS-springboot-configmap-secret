package com.stackroute.sbservice.service;

import java.util.List;

import com.stackroute.sbservice.exception.UserAlreadyExistsException;
import com.stackroute.sbservice.exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.stackroute.sbservice.model.User;
public interface UserService {

    /*
     * You Should not modify this interface. You have to implement these methods in
     * corresponding Impl classes
     */
    User registerUser(User user) throws UserAlreadyExistsException;

    User updateProfile(User user) throws UserNotFoundException;

    List<User> listAllUsers();


}