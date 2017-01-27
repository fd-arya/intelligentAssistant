package com.naderaria.intelligentAssistant.view.protectedPages;


import com.naderaria.intelligentAssistant.entities.account.Admin;
import com.naderaria.intelligentAssistant.entities.enums.Gender;
import com.naderaria.intelligentAssistant.entities.enums.Language;
import com.naderaria.intelligentAssistant.view.util.IPagesAddress;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

/**
 * Created by naderaria on 1/26/17.
 */

@Named("adminRegisteringPage")
@SessionScoped
public class AdminRegisteringPage implements Serializable{

    private static final long serialVersionUID = 1L;

    private Admin admin;
    private Gender gender;
    private Language language;

    public Admin getAdmin(){

        if( admin == null ){
            admin = new Admin();
        }
        return admin;
    }

    public Gender[] getGender(){ return Gender.values(); }

    public Language[] getLanguage(){ return Language.values(); }
    public String saveAdmin(){

      return IPagesAddress.ADMIN_INDEX_PAGE+IPagesAddress.REDIRECT;
    }

    public String cancel(){

        return IPagesAddress.Login_PAGE+IPagesAddress.REDIRECT;
    }

}
