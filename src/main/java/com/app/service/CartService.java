package com.app.service;

import com.app.entities.Cart;
import com.app.entities.User;
import com.app.exception.ProductException;
import com.app.request.AddItemRequest;

public interface CartService {
	
	public Cart createCart(User user);
	
	public String addCartItem(Long userId, AddItemRequest req) throws ProductException;
	
	public Cart findUserCart(Long userId);

}
