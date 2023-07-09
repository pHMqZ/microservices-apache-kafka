package com.pms.paymentservice.services;

import com.pms.paymentservice.model.Payment;

public interface PaymentService {

	void sendPayment(Payment payment);
}
