package com.naderaria.intelligentAssistant.entities.enums;

public enum GoalTimeType {
	
	SHORT_TERM(0),
	MIDTERM(1),
	LONGTIME(2),
	IMMEDIATE(3);
	
	private int selection;
	
	private GoalTimeType( int selection ){
		 
		this.selection = selection;
	}
	
	public int getSelection(){ return selection; }

}
