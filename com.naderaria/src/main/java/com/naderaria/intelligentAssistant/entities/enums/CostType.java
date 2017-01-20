package com.naderaria.intelligentAssistant.entities.enums;

public enum CostType {

	DEBT(0),
	FARE(1),
	BUY(2),
	OTHER(3);
	
	private int selection;
	
	private CostType( int selection ){
		 
		this.selection = selection;
	}
	
	public int getSelection(){ return selection; }
}
