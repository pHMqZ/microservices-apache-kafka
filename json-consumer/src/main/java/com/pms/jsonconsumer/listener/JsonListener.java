package com.pms.jsonconsumer.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.pms.jsonconsumer.model.Payment;

import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;

import static java.lang.Thread.sleep;

@Log4j2
@Component
public class JsonListener {

		@SneakyThrows
		@KafkaListener(topics = "payment-topic", groupId = "create-group", containerFactory = "jsonContainerFactory")
		public void antiFraud(@Payload Payment payment) {
			log.info("Recebendo informações de pagamento {}", payment.toString());
			sleep(2000);
			
			log.info("Validando pagamento...");
			sleep(2000);
			
			log.info("Compra aprovada ...");
			sleep(2000);
		}
		
		@SneakyThrows
		@KafkaListener(topics = "payment-topic", groupId = "pdf-group", containerFactory = "jsonContainerFactory")
		public void pdfGenerator(@Payload Payment payment) {
			sleep(3000);
			log.info("Gerando PDF do produto {}", payment.getId());
			sleep(5000);
			
		}
		
		@SneakyThrows
		@KafkaListener(topics = "payment-topic", groupId = "email-group", containerFactory = "jsonContainerFactory")
		public void sendEmail() {
			sleep(5000);
			log.info("Enviando email de confirmação...");
			
		}
}
