package com.naderaria.intelligentAssistant.entities.financial;

import com.naderaria.intelligentAssistant.entities.abstracts.BaseSalary;
import com.naderaria.intelligentAssistant.dao.interfaces.IQueryNames;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;


@Entity
@Table(name="SALARES")
@DiscriminatorValue("SALARY")
@NamedQueries({
		@NamedQuery( name = IQueryNames.SALARY_SELECT_ALL_KEY , query = IQueryNames.SALARY_SELECT_ALL_VALUE ) ,
		@NamedQuery( name = IQueryNames.SALARY_SELECT_BY_SALARY_MANGER_KEY , query = IQueryNames.SALARY_SELECT_BY_SALARY_MANAGER_VALUE )
})
public class Salary extends BaseSalary {

	private static final long serialVersionUID = 1L;
	
	@ManyToOne(cascade = {CascadeType.MERGE,CascadeType.REFRESH,CascadeType.DETACH,CascadeType.PERSIST},
				fetch = FetchType.EAGER )
	@JoinColumn(name="SALARY_MANAGER_ID")
	private SalaryManager salaryManager;
	
	public SalaryManager getSalaryManager(){ return salaryManager; }
	public void setSalaryManager( SalaryManager salaryManager ){ this.salaryManager = salaryManager; }
	
	

}
