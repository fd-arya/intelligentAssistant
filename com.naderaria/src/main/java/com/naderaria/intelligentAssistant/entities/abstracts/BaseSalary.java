package com.naderaria.intelligentAssistant.entities.abstracts;

import java.util.Calendar;

import com.naderaria.intelligentAssistant.dao.interfaces.IQueryNames;
import com.naderaria.intelligentAssistant.entities.enums.FinanceType;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.EnumType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.naderaria.intelligentAssistant.entities.financial.CurrentFund;
import com.naderaria.intelligentAssistant.entities.financial.ReversFund;

@Entity
@Table( name= "BASE_SALARYS" )
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="SALARY_TYPE",discriminatorType=DiscriminatorType.STRING)
@NamedQueries({
	@NamedQuery( name = IQueryNames.BASE_SALARY_SELECT_ALL_KEY , query = IQueryNames.BASE_SALARY_SELECT_ALL_VALUE ),
	@NamedQuery( name = IQueryNames.BASE_SALARY_SELECT_BY_TITLE_KEY ,query = IQueryNames.BASE_SALARY_SELECT_BY_TITLE_VALUE ),
	@NamedQuery( name = IQueryNames.BASE_SALARY_SELECT_ALL_RECEIVED_KEY , query = IQueryNames.BASE_SALARY_SELECT_ALL_RECEIVED_VALUE ),
	@NamedQuery( name = IQueryNames.BASE_SALARY_SELECT_ALL_FINANCE_TYPE_KEY , query = IQueryNames.BASE_SALARY_SELECT_ALL_FINANCE_TYPE_VALUE )

})

public abstract class BaseSalary extends BaseEntity {

	private static final long serialVersionUID = 1L;
	
	@Column(name="TITLE")
	private String title;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CALENDAR")
	private Calendar calendar;
	
	@Column(name="VALUE")
	private Long value;
	
	@Column(name="RECEIVED")
	private Boolean received;
	
	@OneToOne(cascade={CascadeType.ALL},fetch=FetchType.EAGER,orphanRemoval=true)
	@JoinColumn(name = "REVERS_FUND_ID")
	private ReversFund reversFund;
	
	@OneToOne(cascade={CascadeType.ALL},fetch=FetchType.EAGER,orphanRemoval=true)
	@JoinColumn(name = "CURRENT_FUND_ID")
	private CurrentFund currentFund;
	
	@Enumerated(EnumType.STRING)
	@Column(name="FINANCE_TYPE")
	private FinanceType financeType;
	
	
	public String getTitle(){ return title; }
	public void setTitle(String title){ this.title = title; }
	
	public Calendar getCalendar(){ return calendar; }
	public void setCalendar(Calendar calendar){ this.calendar = calendar; }
	
	public Long getValue(){ return value; }
	public void setValue(Long value){ this.value = value; }
	
	public Boolean isReceived(){ return received; }
	public void setReceived(Boolean received){ this.received = received; }
	
	public ReversFund getReversFund(){ return reversFund; }
	public void setReversFund(ReversFund reversFund){ this.reversFund = reversFund; }
	
	public CurrentFund getCurrentFund(){ return currentFund; }
	public void setCurrentFund(CurrentFund currentFund){ this.currentFund = currentFund; }
	
	public FinanceType getFinanceType(){ return financeType; }
	public void setFinanceType(FinanceType financeType){ this.financeType = financeType; }
	
	

}
