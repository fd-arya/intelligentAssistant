package com.naderaria.intelligentAssistant.entities.enums;

public enum PayType {
	
	CHECK(0),
	PAYMENT(1),
	BILL(2),
	GENERIC(3);
	
	private int selection;
	
	private PayType( int selection ){
		 
		this.selection = selection;
	}
	
	public int getSelection(){ return selection; }
}
