package com.naderaria.intelligentAssistant.entities.enums;

public enum AccessCrud {
	
	CREATE(0),
	READ(1),
	UPDATE(2),
	DELETE(3);
	
	private int selection;
	
	private AccessCrud( int selection ){
		 
		this.selection = selection;
	}
	
	public int getSelection(){ return selection; }
}
