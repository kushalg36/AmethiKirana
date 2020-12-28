package com.amethikirana.AmethiKirana.Order.Repository;

import com.amethikirana.AmethiKirana.Order.Model.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderDetails, Integer> {

}
