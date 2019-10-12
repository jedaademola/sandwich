package wawa.hackerearth.sandwich.dao;


import org.hibernate.HibernateException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import wawa.hackerearth.sandwich.model.entity.Profile;

@Repository
public abstract class ProfileRepositoryImpl implements ProfileRepositoryDao {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProfileRepositoryImpl.class);
    @Autowired
    private ProfileRepository profileRepository;

    @Override
    public Profile saveProfile(Profile profile) {
        String msg = null;
        Profile newProfile = null;
        try {
            newProfile = profileRepository.save(profile);
        } catch (HibernateException e) {
            msg = e.getMessage();
            LOGGER.error(msg, e);
            throw new HibernateException(msg, e);
        }

        return newProfile;
    }


}
