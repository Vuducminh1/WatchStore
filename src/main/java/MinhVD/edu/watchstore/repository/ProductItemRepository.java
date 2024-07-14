package MinhVD.edu.watchstore.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import MinhVD.edu.watchstore.entity.ProductItem;

@Repository
public interface ProductItemRepository extends MongoRepository<ProductItem, ObjectId> {
    
}
