package com.naderaria.intelligentAssistant.entities.medicine;

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
@Table(name="MEDICINE_VISITS")
@NamedQueries({
		@NamedQuery( name = IQueryNames.MEDICINE_VISIT_SELECT_ALL_KEY , query = IQueryNames.MEDICINE_VISIT_SELECT_ALL_VALUE ) ,
		@NamedQuery( name = IQueryNames.MEDICINE_VISIT_SELECT_BY_LOGIN_KEY , query = IQueryNames.MEDICINE_VISIT_SELECT_BY_LOGIN_VALUE )
})
public class MedicineVisit extends BaseEntity {


	private static final long serialVersionUID = 1L;

	@OneToOne(cascade={CascadeType.MERGE,CascadeType.REFRESH,CascadeType.DETACH,CascadeType.PERSIST},
				fetch=FetchType.EAGER)
	@JoinColumn(name="LOGIN_ID")
	private Login login; 
	
	@OneToMany(cascade={CascadeType.MERGE,CascadeType.REFRESH,CascadeType.DETACH,CascadeType.PERSIST},
				fetch=FetchType.LAZY,mappedBy="medicineVisit")
	private Set<MedicineInfo> medicineInfos;
	
	public Login getLogin(){ return login; }
	public void setLogin( Login login ){ this.login = login; }
	
	public Set<MedicineInfo> getMedicineInfos(){ return medicineInfos; }
	public void setMedicineInfos( Set<MedicineInfo> medicineInfos ){ this.medicineInfos = medicineInfos; }
}
