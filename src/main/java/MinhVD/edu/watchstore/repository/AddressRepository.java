package MinhVD.edu.watchstore.repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import MinhVD.edu.watchstore.entity.Address;


@Repository
public interface AddressRepository extends MongoRepository<Address, ObjectId> {
    List<Address> findByUser(ObjectId user);
}
