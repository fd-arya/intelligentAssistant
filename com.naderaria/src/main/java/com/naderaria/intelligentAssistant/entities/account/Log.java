package com.naderaria.intelligentAssistant.entities.account;

import java.util.Calendar;
import java.util.List;
import com.naderaria.intelligentAssistant.dao.interfaces.IQueryNames;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.ElementCollection;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.OneToOne;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;



import com.naderaria.intelligentAssistant.entities.abstracts.BaseEntity;

@Entity
@Table( name = "LOGES")
@NamedQueries({
        @NamedQuery( name = IQueryNames.LOG_SELECT_ALL_KEY , query = IQueryNames.LOG_SELECT_ALL_VALUE ) ,
        @NamedQuery( name = IQueryNames.LOG_SELECT_ALL_BY_LOGIN_KEY , query = IQueryNames.LOG_SELECT_ALL_BY_LOGIN_VALUE ) ,
        @NamedQuery( name = IQueryNames.LOG_SELECT_ALL_BY_SERVICE_NAME_KEY , query = IQueryNames.LOG_SELECT_ALL_BY_SERVICE_NAME_VALUE ) ,
        @NamedQuery( name = IQueryNames.LOG_SELECT_ALL_BY_BETWEEN_CALENDAR_KEY , query = IQueryNames.LOG_SELECT_ALL_BY_BETWEEN_CALENDAR_VALUE )
})
public class Log extends BaseEntity {

	private static final long serialVersionUID = 1L;
	
	@OneToOne( cascade = CascadeType.REFRESH , fetch = FetchType.EAGER )
    @JoinColumn( name = "LOGIN_ID")
	private Login login;
	
	@Column( name ="SERVICE_NAME")
	private String serviceName;
	
	@Column( name ="START_LOG")
    @Temporal(TemporalType.TIMESTAMP)
	private Calendar startLog;
	
	@Column( name ="END_LOG")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar endLog;
	
	@Column( name = "EXCEPTIONS" )
    @ElementCollection( fetch = FetchType.LAZY )
	private List<Exception> exceptions;
	
	public Login getLogin(){ return login; }
	public void setLogin( Login login ){ this.login = login; }
	
	public String getServiceName(){ return serviceName; }
	public void setServiceName( String serviceName ){ this.serviceName = serviceName; }
	
	public Calendar getStartLog(){ return startLog; }
	public void setStartLog( Calendar startLog ){ this.startLog = startLog; }
	
	public Calendar getEndLog(){ return endLog; }
	public void setEndLog( Calendar endLog ){ this.endLog = endLog; }
	
	public List<Exception> getExceptions(){ return exceptions; }
	public void setExceptions( List<Exception> exceptions ){ this.exceptions = exceptions; }
}
