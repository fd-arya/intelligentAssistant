package com.naderaria.intelligentAssistant.entities.account;

import com.naderaria.intelligentAssistant.entities.abstracts.BaseEntity;
import com.naderaria.intelligentAssistant.dao.interfaces.IQueryNames;
import com.naderaria.intelligentAssistant.entities.account.Address;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="ADDRESSES")
@NamedQueries({
		@NamedQuery( name = IQueryNames.ADDRESS_SELECT_ALL_KEY , query = IQueryNames.ADDRESS_SELECT_ALL_VALUE ) ,
		@NamedQuery( name = IQueryNames.ADDRESS_SELECT_ALL_BY_COUNTRY_KEY , query = IQueryNames.ADDRESS_SELECT_ALL_BY_COUNTRY_VALUE ),
		@NamedQuery( name = IQueryNames.ADDRESS_SELECT_ALL_BY_CITY_KEY , query = IQueryNames.ADDRESS_SELECT_ALL_BY_CITY_VALUE )
})
public class Address extends BaseEntity {


	private static final long serialVersionUID = 1L;
	
	@Column(name="TITLE")
	private String title;
	
	@Column(name="COUNTRY")
	private String country;
	
	@Column(name="CITY")
	private String city;
	
	@Column(name="STREET")
	private String street;
	
	@Column(name="ALLEY")
	private String alley;
	
	@Column(name="ZIP_CODE")
	private String zipCode;
	
	@Column(name="NO")
	private Integer no;
	
	public String getTitle(){ return title; }
	public void setTitle( String title ){ this.title = title; }
	
	public String getCountry(){ return country; }
	public void setCountry( String country ){ this.country = country; }
	
	public String getCity(){ return city; }
	public void setCity( String city ){ this.city = city; }
	
	public String getStreet(){ return street; }
	public void setStreet( String street ){ this.street = street; }
	
	public String getAlley(){ return alley; }
	public void setAlley( String alley ){ this.alley = alley; }
	
	public String getZipCode(){ return zipCode; }
	public void setZipCode( String zipCode ){ this.zipCode = zipCode; }
	
	public Integer getNo(){ return no; }
	public void setNo( Integer no ){ this.no = no; }
	
	
	
	
	

}
