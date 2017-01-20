package com.naderaria.intelligentAssistant.entities.medicine;

import java.util.Calendar;
import com.naderaria.intelligentAssistant.entities.abstracts.BaseEntity;
import com.naderaria.intelligentAssistant.entities.account.Address;
import com.naderaria.intelligentAssistant.entities.account.CallInfo;
import com.naderaria.intelligentAssistant.entities.enums.MedicineType;
import com.naderaria.intelligentAssistant.dao.interfaces.IQueryNames;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Enumerated;
import javax.persistence.EnumType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.persistence.OneToOne;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



@Entity
@Table(name="MEDICINE_INFO",uniqueConstraints = @UniqueConstraint(columnNames = "TITLE"))
@NamedQueries({
		@NamedQuery( name = IQueryNames.MEDICINE_INFO_SELECT_ALL_KEY , query = IQueryNames.MEDICINE_INFO_SELECT_ALL_VALUE ) ,
		@NamedQuery( name = IQueryNames.MEDICINE_INFO_SELECT_BY_MEDICINE_VISIT_KEY , query = IQueryNames.MEDICINE_INFO_SELECT_BY_MEDICINE_VISIT_VALUE ) ,
		@NamedQuery( name = IQueryNames.MEDICINE_INFO_SELECT_BY_TITLE_KEY , query = IQueryNames.MEDICINE_INFO_SELECT_BY_TITLE_VALUE ) ,
		@NamedQuery( name = IQueryNames.MEDICINE_INFO_SELECT_BY_ADDRESS_KEY , query = IQueryNames.MEDICINE_INFO_SELECT_BY_ADDRESS_VALUE ) ,
		@NamedQuery( name = IQueryNames.MEDICINE_INFO_SELECT_BY_CALL_INFO_KEY , query = IQueryNames.MEDICINE_INFO_SELECT_BY_CALL_INFO_VALUE ) ,
		@NamedQuery( name = IQueryNames.MEDICINE_INFO_SELECT_All_BY_DATE_KEY , query = IQueryNames.MEDICINE_INFO_SELECT_All_BY_DATE_VALUE ) ,
		@NamedQuery( name = IQueryNames.MEDICINE_INFO_SELECT_ALL_BY_MEDICINE_TYPE_KEY , query = IQueryNames.MEDICINE_INFO_SELECT_ALL_BY_MEDICINE_TYPE_VALUE )
})
public class MedicineInfo extends BaseEntity {

	private static final long serialVersionUID = 1L;
	
	@ManyToOne(cascade = {CascadeType.MERGE,CascadeType.REFRESH,CascadeType.DETACH,CascadeType.PERSIST},
				fetch = FetchType.EAGER)
	@JoinColumn(name="MEDICINE_VISIT_ID")
	private MedicineVisit medicineVisit;
	
	@Column(name="TITLE")
	private String title;
	
	@Column(name="DESCRIPTION")
	private String description;
	
	@OneToOne(cascade={CascadeType.MERGE,CascadeType.REFRESH,CascadeType.DETACH,CascadeType.PERSIST},
				fetch=FetchType.EAGER)
	@JoinColumn(name="ADDRESS_ID")
	private Address address;
	
	private CallInfo callInfo;
	
	@Column(name="FEE")
	private Long fee;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DATE")
	private Calendar date;
	
	@Enumerated(EnumType.STRING)
	@Column(name="MEDICINE_TYPE")
	private MedicineType medicineType;
	
	
	public MedicineVisit getMedicineVisit(){ return medicineVisit; }
	public void setMedicineVisit( MedicineVisit medicineVisit ){ this.medicineVisit = medicineVisit; }
	
	
	public String getTitle(){ return title; }
	public void setTitle( String title ){ this.title = title; }
	
	public String getDescription(){ return description; }
	public void setDescription( String description ){ this.description = description; }
	
	public Address getAddress(){ return address; }
	public void setAddress( Address address ){ this.address = address; }
	
	public CallInfo getCallInfo(){ return callInfo; }
	public void setCallInfo( CallInfo callInfo ){ this.callInfo = callInfo;}
	
	public Long getFee(){ return fee; }
	public void setFee( Long fee ){ this.fee = fee; }
	
	public Calendar getDate(){ return date; }
	public void setDate( Calendar date ){ this.date = date; }
	
	public MedicineType getMedicineType(){ return medicineType; }
	public void setMedicineType( MedicineType medicineType ){ this.medicineType = medicineType; }
	
	
	
	
	
	

}
