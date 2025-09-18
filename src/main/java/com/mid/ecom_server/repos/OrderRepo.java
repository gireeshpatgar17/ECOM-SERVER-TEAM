

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.*;

public interface OrderRepo extends MongoRepository<Ordergit , String>{ 
    List<Order> findUserById(String userId);
}
