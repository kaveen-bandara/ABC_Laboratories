package com.ABC.Laboratories.User;

import com.ABC.Laboratories.User.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findUserByUsername(String username);
    void delete(String username);
}
