package MinhVD.edu.watchstore.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import MinhVD.edu.watchstore.entity.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, ObjectId> {
    
}
