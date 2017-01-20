package com.naderaria.intelligentAssistant.entities.enums;

public enum TaskType {
	
	UNPLANING(0),
	DAILYSCHEDULE(1),
	SPRINT(2);
	
	private int selection;
	
	private TaskType( int selection ){
		 
		this.selection = selection;
	}
	
	public int getSelection(){ return selection; }
}
