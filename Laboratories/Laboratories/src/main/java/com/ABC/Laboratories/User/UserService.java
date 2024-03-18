package com.ABC.Laboratories.User;

import com.ABC.Laboratories.User.User;
import com.ABC.Laboratories.User.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> allUsers() {
        return userRepository.findAll();
    }

    public Optional<User> singleUser(String username) {
        return userRepository.findUserByUsername(username);
    }
    public void deleteUser(String username){
        userRepository.delete(username);
    }
}
