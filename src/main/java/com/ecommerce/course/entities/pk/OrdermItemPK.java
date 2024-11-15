package com.ecommerce.course.entities.pk;

import java.io.Serializable;
import java.util.Objects;

import com.ecommerce.course.entities.Order;
import com.ecommerce.course.entities.Product;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class OrdermItemPK implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name = "order_id")
	private Order order;
	
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product Product;
	
	
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Product getProduct() {
		return Product;
	}
	public void setProduct(Product product) {
		Product = product;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Product, order);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrdermItemPK other = (OrdermItemPK) obj;
		return Objects.equals(Product, other.Product) && Objects.equals(order, other.order);
	}
	
	

}