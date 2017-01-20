package com.naderaria.intelligentAssistant.entities.account;

import com.naderaria.intelligentAssistant.entities.abstracts.BaseEntity;
import com.naderaria.intelligentAssistant.entities.enums.AccessCrud;
import com.naderaria.intelligentAssistant.dao.interfaces.IQueryNames;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Table(name="ACCESS_LEVELS",uniqueConstraints = @UniqueConstraint(columnNames = {"LOGIN_ID","MAIN_MENU","SUB_MENU","ACCESS_CRUD"}))
@NamedQueries({
		@NamedQuery( name = IQueryNames.ACCESS_LEVEL_SELECT_ALL_KEY , query = IQueryNames.ACCESS_LEVEL_SELECT_ALL_VALUE ),
		@NamedQuery( name = IQueryNames.ACCESS_LEVEL_SELECT_ALL_BY_LOGIN_KEY , query = IQueryNames.ACCESS_LEVEL_SELECT_ALL_BY_LOGIN_VALUE ),
		@NamedQuery( name = IQueryNames.ACCESS_LEVEL_SELECT_ALL_BY_MAIN_MENU_KEY , query = IQueryNames.ACCESS_LEVEL_SELECT_ALL_BY_MAIN_MENU_VALUE ),
		@NamedQuery( name = IQueryNames.ACCESS_LEVEL_SELECT_ALL_BY_SUB_MENU_KEY , query = IQueryNames.ACCESS_LEVEL_SELECT_ALL_BY_SUB_MENU_VALUE ),
		@NamedQuery( name = IQueryNames.ACCESS_LEVEL_SELECT_ALL_BY_CRUD_KEY , query = IQueryNames.ACCESS_LEVEL_SELECT_ALL_BY_CRUD_VALUE )
})

public class AccessLevel extends BaseEntity {

	
	private static final long serialVersionUID = 1L;
	
	@ManyToOne(cascade = {CascadeType.MERGE,CascadeType.PERSIST,CascadeType.DETACH,CascadeType.REFRESH}
				,fetch=FetchType.EAGER )
	@JoinColumn(name = "LOGIN_ID" )
	private Login login;
	
	@Column(name="MAIN_MENU")
	private String mainMenu;
	
	@Column(name="SUB_MENU")
	private String subMenu;
	
	@Enumerated(EnumType.STRING)
	@Column(name="ACCESS_CRUD")
	private AccessCrud accessCrud;
	
	
	public Login getLogin(){ return login; }
	public void setLogin( Login login ){ this.login = login; }
	public String getMainMenu(){ return mainMenu; }
	public void setMainMenu( String mainMenu ){ this.mainMenu = mainMenu; }
	
	public String getSubMenu(){ return subMenu; }
	public void setSubMenu( String subMenu ){ this.subMenu = subMenu; }
	
	public AccessCrud getAccessCrud(){ return accessCrud; }
	public void setAccessCrud( AccessCrud accessCrud ){ this.accessCrud = accessCrud; }
	

}
