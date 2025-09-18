//  package com.mid.ecom_server.repos;
import java.util.*;
import org.*;


public interface UserRepo extends MongoRepository <User, String>{
    Optional<User> findByEmail(String email);
}
