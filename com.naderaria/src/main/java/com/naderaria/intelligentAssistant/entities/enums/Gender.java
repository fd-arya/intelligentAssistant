package com.naderaria.intelligentAssistant.entities.enums;

public enum Gender {
	
	WOMAN(0),
	MAN(1),
	OTHER(2);
	
	private int selection;
	
	private Gender( int selection ){
		 
		this.selection = selection;
	}
	
	public int getSelection(){ return selection; }
}
