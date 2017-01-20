package com.naderaria.intelligentAssistant.entities.account;

import com.naderaria.intelligentAssistant.entities.abstracts.BaseEntity;
import com.naderaria.intelligentAssistant.entities.abstracts.User;
import com.naderaria.intelligentAssistant.dao.interfaces.IQueryNames;
import com.naderaria.intelligentAssistant.entities.enums.Language;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="LOGINIS")
@NamedQueries({
		@NamedQuery( name = IQueryNames.LOGIN_SELECT_ALL_kEY , query = IQueryNames.LOGIN_SELECT_ALL_VALUE ) ,
		@NamedQuery( name = IQueryNames.LOGIN_SELECT_ALL_BY_LANGUAGE_KEY , query = IQueryNames.LOGIN_SELECT_ALL_BY_LANGUAGE_VALUE ),
		@NamedQuery( name = IQueryNames.LOGIN_SELECT_BY_USER_KEY , query = IQueryNames.LOGIN_SELECT_BY_USER_VALUE ),
		@NamedQuery( name = IQueryNames.LOGIN_SELECT_BY_USER_NAME_AND_PASSWORD_KEY , query = IQueryNames.LOGIN_SELECT_BY_USER_NAME_AND_PASSWORD_VALUE )
})
public class Login extends BaseEntity {

	
	private static final long serialVersionUID = 1L;
	
	@OneToOne(cascade={CascadeType.REFRESH,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.MERGE}
						,fetch=FetchType.EAGER)
	@JoinColumn(name="USER_ID")
	private User user;
	
	@OneToOne(cascade={CascadeType.REFRESH,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.MERGE}
						,fetch=FetchType.EAGER)
	@JoinColumn(name="USER_NAME_PASSWORD_ID")
	private UserNamePassword userNamePassword;


	@Enumerated(EnumType.STRING)
	@Column(name="LANGUAGE")
	private Language language;

	@OneToMany(cascade={CascadeType.MERGE,CascadeType.REFRESH,CascadeType.DETACH,CascadeType.PERSIST},
			fetch=FetchType.LAZY,mappedBy="login")
	private List<AccessLevel> accessLevels;
	
	public User getUser(){ return user; }
	public void setUser( User user ){ this.user = user; }
	
	public UserNamePassword getUserNamePassword(){ return userNamePassword; }
	public void setUserNamePassword( UserNamePassword userNamePassword ){ this.userNamePassword = userNamePassword; }


	public Language getLanguage(){ return language; }
	public void setLanguage( Language language ){ this.language = language; }

	public List<AccessLevel> getAccessLevels(){ return accessLevels; }
	public void setAccessLevels( List<AccessLevel> accessLevels ){ this.accessLevels = accessLevels; }
	

}
