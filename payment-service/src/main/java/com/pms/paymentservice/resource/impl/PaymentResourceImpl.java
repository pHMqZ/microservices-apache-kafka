package com.pms.paymentservice.resource.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pms.paymentservice.model.Payment;
import com.pms.paymentservice.resource.PaymentResource;
import com.pms.paymentservice.services.PaymentService;

@RestController
@RequestMapping(value = "/payment")
public class PaymentResourceImpl implements PaymentResource{

	@Autowired
	private PaymentService paymentService;
	
	@Override
	public ResponseEntity<Payment> payment(Payment payment) {
		paymentService.sendPayment(payment);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

}
