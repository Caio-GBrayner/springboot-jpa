package com.ecommerce.course.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.course.entities.OrderItem;
import com.ecommerce.course.entities.pk.OrdermItemPK;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, OrdermItemPK> {

	

}
