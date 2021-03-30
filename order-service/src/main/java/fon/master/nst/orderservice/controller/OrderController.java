package fon.master.nst.orderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fon.master.nst.orderservice.service.impl.EmailServiceImpl;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private EmailServiceImpl emailServiceImpl;
	
	/*
	@PostMapping("/submit/{recipient}")
	public void getOrderItemsAndsendEmail(@PathVariable("recipient") String recipient) {
		emailService.getOrderItemsAndsendEmail(recipient);
	}
	*/
	
	@PostMapping("/submit")
	public ResponseEntity getOrderItemsAndsendEmail() {
		emailServiceImpl.getOrderItemsAndsendEmail(""); //hardkotovati mejl primaoca radi testiranja
		return new ResponseEntity(HttpStatus.NO_CONTENT);
	}
}
