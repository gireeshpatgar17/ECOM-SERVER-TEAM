package com.mid.ecom_server.repos;
import java.util.*;
import org.*;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.mid.ecom_server.models.User;


public interface UserRepo extends MongoRepository <User, String>{
    Optional<User> findByEmail(String email);
}
