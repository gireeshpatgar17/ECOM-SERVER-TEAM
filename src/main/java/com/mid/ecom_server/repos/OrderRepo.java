package com.mid.ecom_server.repos;
import java.util.*;
import org.*;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.mid.ecom_server.models.Order;


public interface OrderRepo extends MongoRepository<Order, String>{ 
    List<Order> findUserById(String userId);
}
