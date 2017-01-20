package com.naderaria.intelligentAssistant.entities.financial;

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


@Entity
@Table(name="FACTOR_DETAILS")
@NamedQueries({
		@NamedQuery( name = IQueryNames.FACTOR_DETAILS_SELECT_ALL_KEY , query = IQueryNames.FACTOR_DETAILS_SELECT_ALL_VALUE ) ,
		@NamedQuery( name = IQueryNames.FACTOR_DETAILS_SELECT_ALL_BY_COST_KEY , query = IQueryNames.FACTOR_DETAILS_SELECT_ALL_BY_COST_VALUE ) ,
		@NamedQuery( name = IQueryNames.FACTOR_DETAILS_SELECT_BY_TITLE_KEY , query = IQueryNames.FACTOR_DETAILS_SELECT_BY_TITLE_VALUE )
})
public class FactorDetails extends BaseEntity {

	private static final long serialVersionUID = 1L;
	
	@ManyToOne(cascade = {CascadeType.MERGE,CascadeType.PERSIST,CascadeType.DETACH,CascadeType.REFRESH},
				fetch = FetchType.EAGER )
	@JoinColumn(name="COST_ID")
	private Cost cost;
	
	@Column(name="TITLE")
	private String title; 
	
	@Column(name="AMOUNT_OF")
	private Integer amountOf;
	
	@Column(name="UNIT")
	private String unit;
	
	@Column(name="PRICE_PER_UNIT")
	private Long pricePerUnit;
	
	@Column(name="SUM")
	private Long sum; 
	
	
	public Cost getCost(){ return cost; }
	public void setCost( Cost cost ){ this.cost = cost; }
	
	public String getTitle(){ return title; }
	public void setTitle( String title ){ this.title = title; }
	
	public Integer getAmountOf(){ return amountOf; }
	public void setAmountOf( Integer amountOf ){this.amountOf = amountOf; }
	
	public String getUnit(){ return unit; }
	public void setUnit( String unit ){ this.unit = unit; }

	public Long getPricePerUnit(){ return pricePerUnit; }
	public void setPricePerUnit( Long pricePerUnit ){ this.pricePerUnit = pricePerUnit; }
	
	public Long getSum(){ return sum; }
	public void setSum( Long sum ){ this.sum = sum; }
}
