package com.naderaria.intelligentAssistant.entities.enums;

public enum MedicineType {
	
	CLINIC(0),
	PARA_CLINIC(1),
	HOSPITAL(2),
	OFFICE(3),
	OTHER(4);
	
	private int selection;
	
	private MedicineType( int selection ){
		 
		this.selection = selection;
	}
	
	public int getSelection(){ return selection; }
}
