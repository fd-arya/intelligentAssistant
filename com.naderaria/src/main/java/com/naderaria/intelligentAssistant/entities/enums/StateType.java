package com.naderaria.intelligentAssistant.entities.enums;

public enum StateType {
	
	OPENED(0),
	CLOSED(1),
	REOPENED(2),
	WAITING(3),
	INPROGESS(4),
	DONE(5),
	TODO(6),
	UNPLANNIG(7),
	PLANED(8);
	
	private int selection;
	
	private StateType( int selection ){
		 
		this.selection = selection;
	}
	
	public int getSelection(){ return selection; }

}
