package com.naderaria.intelligentAssistant.entities.enums;

public enum Language {
	
	ENGLISH(0),
	PERSIAN(1);
	
	private int selection;
	
	private Language( int selection ){
		this.selection = selection;
	}
	
	public int getSelection(){
		return selection;
	}
}
