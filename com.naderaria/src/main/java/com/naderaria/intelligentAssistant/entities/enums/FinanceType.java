package com.naderaria.intelligentAssistant.entities.enums;

public enum FinanceType {
	
	PREDICTABLE(0),
	UNPREDICTABLE(1);
	
	private int selection;
	
	private FinanceType( int selection ){
		 
		this.selection = selection;
	}
	
	public int getSelection(){ return selection; }
}
