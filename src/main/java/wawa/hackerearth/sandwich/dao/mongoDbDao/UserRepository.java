package wawa.hackerearth.sandwich.dao.mongoDbDao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import wawa.hackerearth.sandwich.model.mongoDB.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}

