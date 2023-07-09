package com.pms.paymentservice.services.impl;

import org.springframework.stereotype.Service;

import com.pms.paymentservice.model.Payment;
import com.pms.paymentservice.services.PaymentService;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
public class PaymentServiceImpl implements PaymentService{

	@Override
	public void sendPayment(Payment payment) {
		log.info("PAYMENT_SERVICE_IMPL ::: Recebi o pagamento {}", payment);
		
	}

}
