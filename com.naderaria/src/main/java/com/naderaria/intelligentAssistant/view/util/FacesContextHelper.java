package com.naderaria.intelligentAssistant.view.util;

import java.io.Serializable;
import java.util.Locale;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Named
@RequestScoped
public class FacesContextHelper implements Serializable {
	
	
	private static final long serialVersionUID = 1L;

	public  HttpServletRequest getRequest(){

        return (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
    }

    public HttpServletResponse getResponse(){

        return (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getRequest();
    }


    public ExternalContext getContext(){

        return FacesContext.getCurrentInstance().getExternalContext();
    }


    public Locale getLocale(){
       return getRequest().getLocale();
    }

    public Cookie[] getCookie(){
        return getRequest().getCookies();
    }


}
