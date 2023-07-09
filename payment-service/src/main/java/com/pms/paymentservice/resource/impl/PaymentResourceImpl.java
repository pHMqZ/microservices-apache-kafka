package com.pms.paymentservice.resource.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pms.paymentservice.model.Payment;
import com.pms.paymentservice.resource.PaymentResource;

@RestController
@RequestMapping(value = "/payment")
public class PaymentResourceImpl implements PaymentResource{

	@Override
	public ResponseEntity<Payment> payment(Payment payment) {
		// TODO Auto-generated method stub
		return null;
	}

}
