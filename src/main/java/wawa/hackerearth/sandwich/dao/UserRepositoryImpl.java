package wawa.hackerearth.sandwich.dao;


import org.hibernate.HibernateException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import wawa.hackerearth.sandwich.model.entity.User;

@Repository
public abstract class UserRepositoryImpl implements UsersRepositoryDao {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserRepositoryImpl.class);
    @Autowired
    private UsersRepository userRepository;

    @Override
    public User saveUser(User user) {
        String msg = null;
        User newRecord = null;
        try {
            newRecord = userRepository.save(user);
        } catch (HibernateException e) {
            msg = e.getMessage();
            LOGGER.error(msg, e);
            throw new HibernateException(msg, e);
        }

        return newRecord;
    }


}
