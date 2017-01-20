package com.naderaria.intelligentAssistant.view.publicPages;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.servlet.ServletRequestAttributeListener;

import com.naderaria.intelligentAssistant.business.service.internal.interfaces.ILocalGeneralService;
import com.naderaria.intelligentAssistant.dao.interfaces.IQueryNames;
import com.naderaria.intelligentAssistant.entities.abstracts.User;
import com.naderaria.intelligentAssistant.entities.account.Login;
import com.naderaria.intelligentAssistant.view.util.FacesContextHelper;

@Named("loginPage")
@SessionScoped
public class LoginPage implements Serializable {


	private static final long serialVersionUID = 1L;

	@EJB
    private ILocalGeneralService<Login> generalService;

	@EJB
	private ILocalGeneralService<User> userService;


	@PostConstruct
	public void atStartup() throws Exception{



	}

}
