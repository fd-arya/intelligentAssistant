package com.naderaria.intelligentAssistant.view.publicPages;

import java.io.Serializable;
import java.util.*;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.servlet.ServletRequestAttributeListener;

import com.naderaria.intelligentAssistant.business.exceptions.BusinessExceptionManagement;
import com.naderaria.intelligentAssistant.business.service.internal.interfaces.ILocalGeneralService;
import com.naderaria.intelligentAssistant.dao.interfaces.IQueryNames;
import com.naderaria.intelligentAssistant.entities.abstracts.User;
import com.naderaria.intelligentAssistant.entities.account.Admin;
import com.naderaria.intelligentAssistant.entities.account.Login;
import com.naderaria.intelligentAssistant.entities.account.UserNamePassword;
import com.naderaria.intelligentAssistant.view.util.FacesContextHelper;
import com.naderaria.intelligentAssistant.view.util.IPagesAddress;

@Named("loginPage")
@SessionScoped
public class LoginPage implements Serializable {


	@EJB
	private ILocalGeneralService<Login> generalService;

	@EJB
	private ILocalGeneralService<User> userService;

	private static final long serialVersionUID = 1L;

	private UserNamePassword userNamePassword;
	private FacesContextHelper facesContextHelper;


	public UserNamePassword getUserNamePassword(){
		if( userNamePassword == null ){
			userNamePassword = new UserNamePassword();
		}
		return userNamePassword;
	}

	public void setUserNamePassword( UserNamePassword userNamePassword ){ this.userNamePassword = userNamePassword; }

	public FacesContextHelper getFacesContextHelper(){

		if( facesContextHelper == null ){
			facesContextHelper = new FacesContextHelper();
		}
		return facesContextHelper;
	}



	public String logined(){


		try{
			if( isDefaultUser() ){	getFacesContextHelper().getContext().redirect( IPagesAddress.ADMIN_INDEX_PAGE ); }
			Login findLogin = findUser();
			if( findLogin != null ){
				if( findLogin.getUser() instanceof Admin ){
					getFacesContextHelper().getContext().redirect( IPagesAddress.ADMIN_INDEX_PAGE );
				}else {
					getFacesContextHelper().getContext().redirect( IPagesAddress.USER_INDEX_PAGE );
				}
			}else{
				getFacesContextHelper().getContext().redirect( IPagesAddress.ERROR_PAGE );
			}

		}catch ( Exception e ){
			BusinessExceptionManagement.saveException( e );
		}
		return "test";
	}

	private boolean isDefaultUser(){

		Locale locale = Locale.getDefault();
		ResourceBundle resourceBundle = ResourceBundle.getBundle( "language" , locale );
		String defaultUserName = resourceBundle.getString( "defaultUserName" );
		String defaultPassword = resourceBundle.getString( "defaultPassword" );

		return ( getUserNamePassword().getUserName().equals(defaultUserName) && getUserNamePassword().getPassword().equals( defaultPassword ) );
	}

	private Login findUser() throws Exception {

		Map<String,Object> params = new HashMap<>();
		params.put( "userName",getUserNamePassword().getUserName() );
		params.put( "password",getUserNamePassword().getPassword() );
		return generalService.findByQueryName( IQueryNames.LOGIN_SELECT_BY_USER_NAME_AND_PASSWORD_KEY , params );
	}

	public String logOut(){
		return IPagesAddress.Login_PAGE;
	}
}
