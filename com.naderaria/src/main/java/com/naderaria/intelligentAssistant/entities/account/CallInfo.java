package com.naderaria.intelligentAssistant.entities.account;

import com.naderaria.intelligentAssistant.entities.abstracts.BaseEntity;

import com.naderaria.intelligentAssistant.dao.interfaces.IQueryNames;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.UniqueConstraint;


@Entity
@Table(name="CALL_INFOES",uniqueConstraints = @UniqueConstraint(columnNames = {"PHONE","EMAIL"}))
@NamedQueries({
		@NamedQuery( name = IQueryNames.CALL_INFO_SELECT_ALL_KEY , query = IQueryNames.CALL_INFO_SELECT_ALL_VALUE ),
		@NamedQuery( name = IQueryNames.CALL_INFO_SELECT_BY_PHONE_KEY , query = IQueryNames.CALL_INFO_SELECT_BY_PHONE_VALUE ),
		@NamedQuery( name = IQueryNames.CALL_INFO_SELECT_BY_CELL_KEY , query = IQueryNames.CALL_INFO_SELECT_BY_CELL_VALUE ),
		@NamedQuery( name = IQueryNames.CALL_INFO_SELECT_BY_EMAIL_KEY , query = IQueryNames.CALL_INFO_SELECT_BY_EMAIL_VALUE )
})
public class CallInfo extends BaseEntity {

	private static final long serialVersionUID = 1L;
	
	@Column(name="PHONE")
	private String phone;
	
	@Column(name="CELL")
	private String cell;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="WEB_SITE")
	private String webSite;
	
	public String getPhone(){ return phone; }
	public void setPhone( String phone ){ this.phone = phone; }
	
	public String getCell(){ return cell; }
	public void setCell( String cell ){ this.cell = cell; }
	
	public String getEmail(){ return email; }
	public void setEmail( String email ){ this.email = email; }
	
	public String getWebSite(){ return webSite; }
	public void setWebSite( String webSite ){ this.webSite = webSite; }

}
