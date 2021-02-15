package fon.master.nst.shoppingcart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fon.master.nst.shoppingcart.VO.Product;
import fon.master.nst.shoppingcart.model.ShoppingCart;
import fon.master.nst.shoppingcart.service.ShoppingCartService;

@RestController
@RequestMapping("/cart")
public class ShoppingCartController {

	@Autowired
	private ShoppingCartService shoppingCartService;
	
	@PostMapping("/addItem")
	public void addItem(@RequestBody Product product) {
		shoppingCartService.addItem(product);
	}
	
	@GetMapping("/{id}")
	public ShoppingCart getShoppCart(@PathVariable("id") Long userId) {
		return shoppingCartService.getShoppingCart(userId);
	}
	
	@DeleteMapping("/item/{id}")
	public void deleteIdem (@PathVariable("id") Long itemId) {
		shoppingCartService.removeCartItem(itemId);
	}
	
	@DeleteMapping("/{id}")
	public void deleteCart (@PathVariable("id") Long cartId) {
		shoppingCartService.deleteCart(cartId);
	}
}
