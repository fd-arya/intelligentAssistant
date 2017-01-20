package com.naderaria.intelligentAssistant.entities.account;

import java.util.Set;
import com.naderaria.intelligentAssistant.entities.abstracts.BaseEntity;
import com.naderaria.intelligentAssistant.entities.enums.Language;
import com.naderaria.intelligentAssistant.dao.interfaces.IQueryNames;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.UniqueConstraint;


@Entity
@Table(name="USERNAME_PASSWORDS",uniqueConstraints = @UniqueConstraint(columnNames ="USER_NAME" ))
@NamedQueries({
		@NamedQuery( name = IQueryNames.USER_NAME_PASSWORD_SELECT_ALL_KEY , query = IQueryNames.USER_NAME_PASSWORD_SELECT_ALL_VALUE ) ,
		@NamedQuery( name = IQueryNames.USER_NAME_PASSWORD_SELECT_BY_NAME_KEY , query = IQueryNames.USER_NAME_PASSWORD_SELECT_BY_NAME_VALUE )

})
public class UserNamePassword extends BaseEntity {

	
	private static final long serialVersionUID = 1L;
	
	@Column(name="USER_NAME")
	private String userName;
	
	@Column(name="PASSWORD")
	private String password;
	

	public String getUserName(){ return userName; }
	public void setUserName( String userName ){ this.userName = userName; }
	
	public String getPassword(){ return password; }
	public void setPassword( String password ){ this.password = password; }
	

	
	
	

}
