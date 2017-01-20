package com.naderaria.intelligentAssistant.entities.abstracts;

import com.naderaria.intelligentAssistant.dao.interfaces.IQueryNames;
import com.naderaria.intelligentAssistant.entities.financial.FundManager;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Table;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.CascadeType;
import javax.persistence.Column;


@Entity
@Table(name="FUNDS")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="FUND_TYPE",discriminatorType=DiscriminatorType.STRING)
@NamedQueries({
		@NamedQuery( name = IQueryNames.FUND_SELECT_ALL_KEY , query = IQueryNames.FUND_SELECT_ALL_VALUE ) ,
		@NamedQuery( name = IQueryNames.FUND_SELECT_BY_FUND_MANAGER_KEY , query = IQueryNames.FUND_SELECT_BY_FUND_MANAGER_VALUE ),
		@NamedQuery( name = IQueryNames.FUND_SELECT_ALL_BY_MIN_STOCK_KEY , query = IQueryNames.FUND_SELECT_ALL_BY_MIN_STOCK_VALUE ),
		@NamedQuery( name = IQueryNames.FUND_SELECT_ALL_BY_MAX_STOCK_KEY , query = IQueryNames.FUND_SELECT_ALL_BY_MAX_STOCK_VALUE ),
		@NamedQuery( name = IQueryNames.FUND_SELECT_ALL_BY_CURRENT_STOCK_KEY , query = IQueryNames.FUND_SELECT_ALL_BY_CURRENT_STOCK_VALUE ) ,
		@NamedQuery( name = IQueryNames.FUND_SELECT_ALL_BY_BETWEEN_KEY , query = IQueryNames.FUND_SELECT_ALL_BY_BETWEEN_VALUE )
})
public abstract class Fund extends BaseEntity {

	private static final long serialVersionUID = 1L;
	
	@ManyToOne(cascade = {CascadeType.ALL} ,fetch = FetchType.EAGER)
	@JoinColumn(name="FUND_MANAGER_ID")
	private FundManager fundManager;
	
	@Column(name="MIN_STOCK")
	private Long minStock;
	
	@Column(name="MAX_STOCK")
	private Long maxStock;
	
	@Column(name="CURRENT_STOCK")
	private Long currentStock;
	
	public FundManager getFundManager(){ return fundManager; }
	public void setFundManager( FundManager fundManager ){ this.fundManager = fundManager; }
	
	public Long getMinStock(){ return minStock; }
	public void setMinStock( Long minStock ){ this.minStock = minStock; }
	
	public Long getMaxStock(){ return maxStock; }
	public void setMaxStock( Long maxStock ){ this.maxStock = maxStock; }
	
	public Long getCurrentStock(){ return currentStock; }
	public void setCurrentStock( Long currentStock ){ this.currentStock = currentStock; }
	
	
}
