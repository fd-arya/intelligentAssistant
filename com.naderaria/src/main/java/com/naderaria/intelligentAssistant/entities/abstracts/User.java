package com.naderaria.intelligentAssistant.entities.abstracts;

import com.naderaria.intelligentAssistant.dao.interfaces.IQueryNames;
import com.naderaria.intelligentAssistant.entities.account.Address;
import com.naderaria.intelligentAssistant.entities.account.CallInfo;
import com.naderaria.intelligentAssistant.entities.enums.Gender;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Column;
import javax.persistence.Enumerated;
import javax.persistence.EnumType;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.OneToOne;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import java.util.Calendar;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name ="USER_TYPE",discriminatorType = DiscriminatorType.STRING)
@Table(name="USERS")
@NamedQueries({
		@NamedQuery( name = IQueryNames.USER_SELECT_ALL_KEY, query = IQueryNames.USER_SELECT_ALL_VALUE ),
		@NamedQuery( name = IQueryNames.USER_SELECT_ALL_BY_GENDER_KEY , query = IQueryNames.USER_SELECT_ALL_BY_GENDER_VALUE ),
		@NamedQuery( name = IQueryNames.USER_SELECT_ALL_BY_BIRTH_CITY_KEY , query = IQueryNames.USER_SELECT_ALL_BY_BIRTH_CITY_VALUE ),
		@NamedQuery( name = IQueryNames.USER_SELECT_ALL_BY_BIRTH_DATE_KEY , query = IQueryNames.USER_SELECT_ALL_BY_BIRTH_DATE_VALUE ),
		@NamedQuery( name = IQueryNames.USER_SELECT_ALL_BY_ADDRESS_KEY , query = IQueryNames.USER_SELECT_ALL_BY_ADDRESS_VALUE ),
		@NamedQuery( name = IQueryNames.USER_SELECT_ALL_BY_CALL_INFO_KEY , query = IQueryNames.USER_SELECT_ALL_BY_CALL_INFO_VALUE ),
		@NamedQuery( name = IQueryNames.USER_SELECT_EXISTS_USER_KEY , query = IQueryNames.USER_SELECT_EXISTS_USER_VALUE )
})
public abstract class User extends BaseEntity {

	private static final long serialVersionUID = 1L;
	
	@Column(name="FIRST_NAME",length=25)
	private String firstName;
	
	@Column(name="LAST_NAME",length=25)
	private String lastName;
	
	@Enumerated(EnumType.STRING)
	@Column(name="GENDER")
	private Gender gender;
	
	@Column(name="BIRTH_CITY",length=20)
	private String birthCity;
	
	@Temporal(TemporalType.DATE)
	@Column(name="BIRTH_DATE")
	private Calendar birthDate;
	
	@Lob
	@Column(name="IMAGE")
	private Byte[] image;
	
	@OneToOne(cascade={CascadeType.ALL},fetch=FetchType.EAGER,orphanRemoval=true)
	@JoinColumn(name = "ADDRESS_ID")
	private Address address;
	
	@OneToOne(cascade={CascadeType.ALL},fetch=FetchType.EAGER,orphanRemoval=true)
	@JoinColumn(name = "CALL_INFO_ID")
	private CallInfo callInfo;
	
	
	public String getFirstName(){ return firstName; }
	public void setFirstName( String firstName ){ this.firstName = firstName; }
	
	public String getLastName(){ return lastName; }
	public void setLastName( String lastName ){ this.lastName = lastName; }
	
	public Gender getGender(){ return gender; }
	public void setGender( Gender gender ){ this.gender = gender; }
	
	public String getBirthCity(){ return birthCity; }
	public void setBirthCity( String birthCity ){ this.birthCity = birthCity; }
	
	public Calendar getBirthDate(){ return birthDate; }
	public void setBirthDate( Calendar birthDate ){ this.birthDate = birthDate; }
	
	public Byte[] getImage(){ return image; }
	public void setImage( Byte[] image ){ this.image = image; }
	
	public Address getAddress(){ return address; }
	public void setAddress( Address address ){ this.address = address; }
	
	public CallInfo getCallInfo(){ return callInfo; }
	public void  setCallInfo( CallInfo callInfo ){ this.callInfo = callInfo; }
	

}
