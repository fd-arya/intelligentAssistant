package com.naderaria.intelligentAssistant.entities.medicine;

import java.util.Calendar;
import com.naderaria.intelligentAssistant.entities.abstracts.BaseEntity;
import com.naderaria.intelligentAssistant.entities.enums.MedicineTestType;
import com.naderaria.intelligentAssistant.dao.interfaces.IQueryNames;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.EnumType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table(name="MEDICINE_TESTES")
@NamedQueries({
		@NamedQuery( name = IQueryNames.MEDICINE_TEST_SELECT_ALL_KEY , query = IQueryNames.MEDICINE_TEST_SELECT_ALL_VALUE ) ,
		@NamedQuery( name = IQueryNames.MEDICINE_TEST_SELECT_BY_MEDICINE_TEST_MANAGER_KEY , query = IQueryNames.MEDICINE_TEST_SELECT_BY_MEDICINE_TEST_MANAGER_VALUE ) ,
		@NamedQuery( name = IQueryNames.MEDICINE_TEST_SELECT_ALL_BY_MEDICINE_TEST_TYPE_KEY , query = IQueryNames.MEDICINE_TEST_SELECT_ALL_BY_MEDICINE_TEST_TYPE_VALUE ) ,
		@NamedQuery( name = IQueryNames.MEDICINE_TEST_SELECT_ALL_BY_DATE_KEY , query = IQueryNames.MEDICINE_TEST_SELECT_ALL_BY_DATE_VALUE ) ,
		@NamedQuery( name = IQueryNames.MEDICINE_TEST_SELECT_ALL_BY_RELATED_DISEASES_KEY , query = IQueryNames.MEDICINE_TEST_SELECT_ALL_BY_RELATED_DISEASES_VALUE )
})
public class MedicineTest extends BaseEntity {

	private static final long serialVersionUID = 1L;
	
	@ManyToOne(cascade = {CascadeType.MERGE,CascadeType.REFRESH,CascadeType.DETACH,CascadeType.PERSIST},
				fetch = FetchType.EAGER)
	@JoinColumn(name="MEDICINE_TEST_MANAGER_ID")
	private MedicineTestManager medicineTestManager;
	
	@Enumerated(EnumType.STRING)
	@Column(name="MEDICINE_TEST_TYPE")
	private MedicineTestType medicineTestType;
	
	@Column(name="VALUE")
	private String value;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DATE")
	private Calendar date;
	
	@Column(name="NORMAL_VALUE")
	private String normalValue;
	
	@Column(name="RELATED_DISEASES")
	private Boolean relatedDiseases;
	
	
	public MedicineTestManager getMedicineTestManager(){ return medicineTestManager; }
	public void setMedicineTestManager( MedicineTestManager medicinetestManager ){ this.medicineTestManager = medicinetestManager; }
	
	
	public MedicineTestType getMedicineTestType(){ return medicineTestType; }
	public void setMedicineTestType( MedicineTestType medicineTestType ){ this.medicineTestType = medicineTestType; }
	
	public String getValue(){ return value; }
	public void setValue( String value ){ this.value = value;  }
	
	public Calendar getDate(){ return date; }
	public void setDate( Calendar date ){ this.date = date; }
	
	public String getNormalValue(){ return normalValue; }
	public void setNormalValue( String normalValue ){ this.normalValue = normalValue; }
	
	public Boolean isRelatedDiseases(){ return relatedDiseases; }
	public void setRelatedDiseases( Boolean relatedDiseases ){ this.relatedDiseases = relatedDiseases; }
	
	
	

}
