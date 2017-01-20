package com.naderaria.intelligentAssistant.entities.medicine;

import java.util.Calendar;
import java.util.Date;

import com.naderaria.intelligentAssistant.entities.abstracts.BaseEntity;
import com.naderaria.intelligentAssistant.dao.interfaces.IQueryNames;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="DRUGS" ,uniqueConstraints = @UniqueConstraint(columnNames ={"TITLE"}))
@NamedQueries({
		@NamedQuery( name = IQueryNames.DRUG_SELECT_ALL_KEY , query = IQueryNames.DRUG_SELECT_ALL_VALUE ) ,
		@NamedQuery( name = IQueryNames.DRUG_SELECT_BY_DRUG_MANAGER_KEY , query = IQueryNames.DRUG_SELECT_BY_DRUG_MANAGER_VALUE ) ,
		@NamedQuery( name = IQueryNames.DRUG_SELECT_BY_TITLE_KEY , query = IQueryNames.DRUG_SELECT_BY_TITLE_VALUE ) ,
		@NamedQuery( name = IQueryNames.DRUG_SELECT_BY_CONSUMPTION_INSTRUCTION_KEY , query = IQueryNames.DRUG_SELECT_BY_CONSUMPTION_INSTRUCTION_VALUE ) ,
		/*@NamedQuery( name = IQueryNames.DRUG_SELECT_ALL_BY_MEMBER_KEY , query = IQueryNames.DRUG_SELECT_ALL_BY_MEMBER_VALUE ) ,*/
		@NamedQuery( name = IQueryNames.DRUG_SELECT_ALL_BY_ACTIVE_KEY , query = IQueryNames.DRUG_SELECT_ALL_BY_ACTIVE_VALUE )
})
public class Drug extends BaseEntity {

	private static final long serialVersionUID = 1L;
	
	@ManyToOne(cascade = {CascadeType.MERGE,CascadeType.REFRESH,CascadeType.DETACH,CascadeType.PERSIST} ,
				fetch = FetchType.EAGER)
	@JoinColumn(name="DRUG_MANAGER_ID")
	private DrugManager drugManager;
	
	@Column(name="TITLE")
	private String title;
	
	@Column(name="CONSUMPTION_INSTRUCTION")
	private String consumptionInstruction;
	
	@Temporal(TemporalType.DATE)
	@Column(name="START_DATE")
	private Calendar startDate;
	
	@Temporal(TemporalType.DATE)
	@Column(name="END_DATE")
	private Calendar endDate;
	
	@Temporal(TemporalType.TIME)
	@Column(name="USE_TIME")
	private Date useTime;
	
	@Column(name="USE_COUNT")
	private Integer useCount; 
	
	@Column(name="DESCRIPTION")
	private String description;
	
	@Column(name="COMPLICATIONS")
	private String complications;
	
	@Column(name="CONSUMED")
	private Boolean consumed;
	
	@Column(name="ACTIVE")
	private Boolean active;
	
	
	
	public DrugManager getDrugManager(){ return drugManager; }
	public void setDrugManager( DrugManager drugManager ){ this.drugManager = drugManager; }
	
	public String getTitle(){ return title; }
	public void setTitle( String title ){ this.title = title; }
	
	public String getConsumptionInstruction(){ return consumptionInstruction; }
	public void setConsumptionInstruction( String consumptionInstruction ) { this.consumptionInstruction = consumptionInstruction; }
	
	public Calendar getStartDate(){ return startDate; }
	public void setStartDate( Calendar startDate ){ this.startDate = startDate; }
	
	public Calendar getEndDate(){ return endDate; }
	public void setEndDate( Calendar endDate ){ this.endDate = endDate; }
	
	public Date getUseTime(){ return useTime; }
	public void setUseTime( Date useTime ){ this.useTime = useTime; }
	
	public Integer getUseCount(){ return useCount; }
	public void setUseCount( Integer useCount ){ this.useCount = useCount; }
	
	public String getDescription(){ return description; }
	public void setDescription( String description ){ this.description = description; }
	
	public String getComplications(){ return complications; }
	public void setComplications( String complications ){ this.complications = complications; }
	
	public Boolean isConsumed(){ return consumed; }
	public void setConsumed( Boolean consumed ){ this.consumed =consumed; }
	
	public Boolean isActive(){ return active; }
	public void setActive( Boolean active ){ this.active = active; }

}
