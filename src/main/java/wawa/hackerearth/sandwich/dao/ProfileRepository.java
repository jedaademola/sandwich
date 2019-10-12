package wawa.hackerearth.sandwich.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import wawa.hackerearth.sandwich.model.entity.Profile;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long> {

	@Query(value = "SELECT * FROM  Profile p, Customer c,"
			+ "OrderItems o where  p.customer_id = c.customer_id"
			+ "AND c.customer_id = o.customer_id WHERE customer_id = ?1", nativeQuery = true)
	Profile displayProfile (String customerId);
}
