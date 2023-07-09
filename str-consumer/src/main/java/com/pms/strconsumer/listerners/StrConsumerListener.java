package com.pms.strconsumer.listerners;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Component
public class StrConsumerListener {
	
	@KafkaListener(groupId = "group-1", topics = "str-topic", containerFactory = "strContainerFactory")
	public void listener(String message) {
		log.info("Receive message{}", message);
	}

}
