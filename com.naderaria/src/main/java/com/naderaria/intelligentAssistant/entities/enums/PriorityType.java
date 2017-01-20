package com.naderaria.intelligentAssistant.entities.enums;

public enum PriorityType {
	
	CRITICAL(0),
	IMMEDIATE(1),
	HIGH(2),
	NORMAL(3),
	LOW(4);
	
	private int selection;
	
	private PriorityType( int selection ){
		 
		this.selection = selection;
	}
	
	public int getSelection(){ return selection; }

}
