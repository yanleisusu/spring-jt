package com.jt.service;

import java.util.List;

import com.jt.pojo.Cart;

public interface DubboCartService {

	List<Cart> findCartListByUserId(Long userId);

	void deleteCart(Cart cart);

	void savaCart(Cart cart);

	void updataCartNum(Cart cart);

	

}
