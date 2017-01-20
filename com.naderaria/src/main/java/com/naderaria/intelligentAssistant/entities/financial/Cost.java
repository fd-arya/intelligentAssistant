package com.naderaria.intelligentAssistant.entities.financial;

import java.util.Calendar;
import java.util.Set;

import com.naderaria.intelligentAssistant.entities.abstracts.BaseEntity;
import com.naderaria.intelligentAssistant.entities.enums.CostType;
import com.naderaria.intelligentAssistant.entities.enums.FinanceType;
import com.naderaria.intelligentAssistant.entities.enums.PayType;
import com.naderaria.intelligentAssistant.dao.interfaces.IQueryNames;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Enumerated;
import javax.persistence.EnumType;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.OneToOne;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
@Table(name="COSTS")
@NamedQueries({
		@NamedQuery( name = IQueryNames.COST_SELECT_ALL_KEY , query = IQueryNames.COST_SELECT_ALL_VALUE ),
		@NamedQuery( name = IQueryNames.COST_SELECT_ALL_BY_MANAGER_KEY , query = IQueryNames.COST_SELECT_ALL_BY_MANAGER_VALUE ),
		@NamedQuery( name = IQueryNames.COST_SELECT_BY_TITLE_KEY , query = IQueryNames.COST_SELECT_BY_TITLE_VALUE ) ,
		@NamedQuery( name = IQueryNames.COST_SELECT_ALL_BY_PAY_DATE_KEY , query = IQueryNames.COST_SELECT_ALL_BY_PAY_DATE_VALUE ) ,
		@NamedQuery( name = IQueryNames.COST_SELECT_ALL_BY_PAID_KEY , query = IQueryNames.COST_SELECT_ALL_BY_PAID_VALUE ) ,
		@NamedQuery( name = IQueryNames.COST_SELECT_ALL_BY_COST_TYPE_KEY , query = IQueryNames.COST_SELECT_ALL_BY_COST_TYPE_VALUE ) ,
		@NamedQuery( name = IQueryNames.COST_SELECT_ALL_BY_PAY_TYPE_KEY , query = IQueryNames.COST_SELECT_ALL_BY_PAY_TYPE_VALUE ) ,
		@NamedQuery( name = IQueryNames.COST_SELECT_ALL_BY_FINANCE_TYPE_KEY , query = IQueryNames.COST_SELECT_ALL_BY_FINANCE_TYPE_VALUE )
})
public class Cost extends BaseEntity {

	
	private static final long serialVersionUID = 1L;
	
	@ManyToOne(cascade = {CascadeType.MERGE,CascadeType.REFRESH,CascadeType.DETACH,CascadeType.PERSIST},
			fetch = FetchType.EAGER)
	@JoinColumn(name="COST_MANAGERS_ID")
	private CostManager costManager;
	
	@Column(name="TITLE")
	private String title;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="PAY_DATE")
	private Calendar payDate;
	
	@Column(name="SELLER")
	private String seller;
	
	@Column(name="SUM")
	private Double sum;
	
	@Column(name="PAID")
	private Boolean paid;
	
	@Enumerated(EnumType.STRING)
	@Column(name="COST_TYPE")
	private CostType costType;
	
	@Enumerated(EnumType.STRING)
	@Column(name="PAY_TYPE")
	private PayType payType;
	
	@OneToMany(cascade={CascadeType.ALL},fetch=FetchType.LAZY,mappedBy="cost")
	private Set<FactorDetails> details;
	
	@Enumerated(EnumType.STRING)
	@Column(name="FINANCE_TYPE")
	private FinanceType financeType;
	
	@OneToOne(cascade={CascadeType.MERGE,CascadeType.REFRESH,CascadeType.DETACH,CascadeType.PERSIST}
						,fetch=FetchType.EAGER)
	@JoinColumn(name="CURRENT_FUND_ID")
	private CurrentFund currentFund;
	
	
	public CostManager getCostManager(){ return costManager; }
	public void setCostManager( CostManager costManager ){ this.costManager = costManager; }
	
	
	public String getTitle(){ return title; }
	public void setTitle( String title ){ this.title = title; }
	
	public Calendar getPayDate(){ return payDate; }
	public void setPayDate( Calendar payDate ){ this.payDate = payDate; }
	
	public String getSeller(){ return seller; }
	public void setSeller( String seller ){ this.seller = seller; }
	
	public Double getSum(){ return sum; }
	public void setSum( Double sum ){ this.sum = sum; }
	
	public Boolean isPaid(){return paid; }
	public void setPaid( Boolean paid ){ this.paid = paid; }
	
	public CostType getCostType(){ return costType; }
	public void setCostType( CostType costType ){ this.costType = costType; }
	
	public PayType getPayType(){ return payType; }
	public void setPayType( PayType payType ){ this.payType = payType; }
	
	public Set<FactorDetails> getDetails(){ return details; }
	public void setDetails( Set<FactorDetails> details ){ this.details = details; }
	
	public FinanceType getFinanceType(){ return financeType; }
	public void setFinanceType( FinanceType financeType ){ this.financeType = financeType; }
	
	public CurrentFund getCurrentFund(){ return currentFund; }
	public void setCurrentFund( CurrentFund currentFund ){ this.currentFund = currentFund; }

}
