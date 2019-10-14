package wawa.hackerearth.sandwich.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import wawa.hackerearth.sandwich.model.entity.Profile;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long> {

	@Query(value = "SELECT * FROM   Customer c,"
			+ " order_items o WHERE "
			+ " c.id = o.customer and  c.customer_id = ?1", nativeQuery = true)
	Profile displayProfile (String customerId);
}
