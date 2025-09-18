// package com.mid.ecom_server.repos;
import java.util.*;
import org.*;


public interface OrderRepo extends MongoRepository<Order, String>{ 
    List<Order> findUserById(String userId);
}
