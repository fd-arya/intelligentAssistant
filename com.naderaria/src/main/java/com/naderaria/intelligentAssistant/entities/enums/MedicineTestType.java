package com.naderaria.intelligentAssistant.entities.enums;

public enum MedicineTestType {
	
	BLOOD_SUGAR(0),
	BLOOD_PRESSURE(1);
	
	private int selection;
	
	private MedicineTestType( int selection ){
		 
		this.selection = selection;
	}
	
	public int getSelection(){ return selection; }
}
