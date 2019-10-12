package wawa.hackerearth.sandwich.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import wawa.hackerearth.sandwich.model.entity.OrderItems;

@Repository
public interface OrderRepository extends JpaRepository<OrderItems, Long> {

}
