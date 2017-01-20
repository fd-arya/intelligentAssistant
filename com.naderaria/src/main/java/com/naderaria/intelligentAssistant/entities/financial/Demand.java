package com.naderaria.intelligentAssistant.entities.financial;

import com.naderaria.intelligentAssistant.entities.abstracts.BaseSalary;
import com.naderaria.intelligentAssistant.entities.enums.PayType;
import com.naderaria.intelligentAssistant.dao.interfaces.IQueryNames;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.DiscriminatorValue;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.EnumType;

@Entity
@Table(name="DEMANDS")
@DiscriminatorValue("DEMAND")
@NamedQueries({
		@NamedQuery( name = IQueryNames.DEMAND_SELECT_ALL_KEY , query = IQueryNames.DEMAND_SELECT_ALL_VALUE ) ,
		@NamedQuery( name = IQueryNames.DEMAND_SELECT_ALL_BY_DEMAND_MANAGER_KEY , query = IQueryNames.DEMAND_SELECT_ALL_BY_DEMAND_MANAGER_VALUE ) ,
		@NamedQuery( name = IQueryNames.DEMAND_SELECT_ALL_BY_DEMAND_TYPE_KEY , query = IQueryNames.DEMAND_SELECT_ALL_BY_PAY_TYPE_VALUE )
})
public class Demand extends BaseSalary {

	private static final long serialVersionUID = 1L;
	
	@ManyToOne(cascade = {CascadeType.MERGE,CascadeType.REFRESH,CascadeType.DETACH,CascadeType.PERSIST},
			fetch = FetchType.EAGER )
	@JoinColumn(name="DEMAND_MANAGER_ID")
	private DemandManager demandManager;
	
	@Enumerated(EnumType.STRING)
	@Column(name="PAY_TYPE")
	private PayType payType;
	
	public DemandManager getDemandManager(){ return demandManager; }
	public void setDemandManager( DemandManager demandManager ){ this.demandManager = demandManager; }
	
	
	public PayType getPayType(){ return payType; }
	public void setPayType( PayType payType ){ this.payType = payType; }

}
