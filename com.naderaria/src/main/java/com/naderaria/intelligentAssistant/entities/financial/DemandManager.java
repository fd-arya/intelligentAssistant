package com.naderaria.intelligentAssistant.entities.financial;

import java.util.Set;
import com.naderaria.intelligentAssistant.entities.abstracts.BaseEntity;
import com.naderaria.intelligentAssistant.entities.account.Login;
import com.naderaria.intelligentAssistant.dao.interfaces.IQueryNames;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;

@Entity
@Table(name="DEMAND_MANAGERS")
@NamedQueries({
		@NamedQuery( name = IQueryNames.DEMAND_MANAGER_SELECT_ALL_KEY , query = IQueryNames.DEMAND_MANAGER_SELECT_ALL_VALUE ) ,
		@NamedQuery( name = IQueryNames.DEMAND_MANAGER_SELECT_BY_LOGIN_KEY , query = IQueryNames.DEMAND_MANAGER_SELECT_BY_LOGIN_VALUE )
})
public class DemandManager extends BaseEntity {

	private static final long serialVersionUID = 1L;
	
	@OneToOne(cascade={CascadeType.MERGE,CascadeType.REFRESH,CascadeType.DETACH,CascadeType.PERSIST},
				fetch=FetchType.EAGER)
	@JoinColumn(name="LOGIN_ID")
	private Login login;
	
	@OneToMany(cascade={CascadeType.MERGE,CascadeType.REFRESH,CascadeType.DETACH,CascadeType.PERSIST},
				fetch=FetchType.LAZY,mappedBy="demandManager")
	private Set<Demand> demands; 
	
	public Login getLogin(){ return login; }
	public void setLogin( Login  login ){ this.login = login; }
	
	public Set<Demand> getDemands(){ return demands; }
	public void setDemands( Set<Demand> demands ){ this.demands = demands; }
	

}
