package com.pms.paymentservice.services.impl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.pms.paymentservice.model.Payment;
import com.pms.paymentservice.services.PaymentService;

import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
public class PaymentServiceImpl implements PaymentService{
 
	@Autowired
	private KafkaTemplate<String, Serializable> kafkaTemplate;
	
	@SneakyThrows
	@Override
	public void sendPayment(Payment payment) {
		log.info("Recebi o pagamento {}", payment);
		Thread.sleep(1000);
		
		log.info("Enviando pagamento...");
		kafkaTemplate.send("payment-topic", payment);
		
		
	}

}
