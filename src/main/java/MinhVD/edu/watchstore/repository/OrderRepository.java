package MinhVD.edu.watchstore.repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import MinhVD.edu.watchstore.entity.Order;


@Repository
public interface OrderRepository extends MongoRepository<Order, ObjectId> {
    List<Order> findByUser(ObjectId user);
}
