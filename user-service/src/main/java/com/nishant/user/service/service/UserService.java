package com.nishant.user.service.service;

import com.nishant.user.service.exception.UserException;
import com.nishant.user.service.modal.User;

import java.util.List;

public interface UserService {
    User createUser(User user);
    User updateUser(Long id, User user) throws UserException;
    void deleteUser(Long id) throws UserException;
    List<User> getAllUsers();
    User getUserById(Long id) throws UserException;
}
