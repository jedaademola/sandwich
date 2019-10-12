package wawa.hackerearth.sandwich.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import wawa.hackerearth.sandwich.model.entity.Profile;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long> {

}