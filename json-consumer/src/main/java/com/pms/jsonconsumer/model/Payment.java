package com.pms.jsonconsumer.model;

import java.io.Serializable;

import lombok.Getter;


@Getter
public class Payment implements Serializable{

	private Long id;
	private Long idUser;
	private Long idProduct;
	private String cardNumber;
	
	@Override
	public String toString() {
		return "Payment [id=" + id + ", idUser=" + idUser + ", idProduct=" + idProduct + ", cardNumber=" + cardNumber
				+ "]";
	}
	
	
}
