package com.naderaria.intelligentAssistant.view.publicPages;

import com.naderaria.intelligentAssistant.business.service.internal.interfaces.ILocalGeneralService;
import com.naderaria.intelligentAssistant.dao.interfaces.IQueryNames;
import com.naderaria.intelligentAssistant.entities.abstracts.User;
import com.naderaria.intelligentAssistant.entities.account.Admin;
import com.naderaria.intelligentAssistant.entities.account.Login;
import com.naderaria.intelligentAssistant.entities.account.UserNamePassword;
import com.naderaria.intelligentAssistant.entities.enums.Gender;
import com.naderaria.intelligentAssistant.view.util.FacesContextHelper;

import javax.ejb.EJB;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Singleton;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;



/**
 * Created by naderaria on 1/12/17.
 */



@ApplicationScoped
public class ApplicationBean implements ServletContextListener {


    @EJB
    private ILocalGeneralService<Login> generalService;





    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        FacesContextHelper facesContextHelper = new FacesContextHelper();
        try{

            Login login = generalService.save(createDefaultLogin());

            if( login != null ){
               facesContextHelper.getContext().redirect("publicPages/loginPage.xhtml");
            }
        }catch (Exception e){
            try{
                facesContextHelper.getContext().redirect("publicPages/errorPage.xhtml");
            }catch (Exception ex){
                System.out.println("Server is Down");
            }
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }

    private Login createDefaultLogin(){

        Login adminLogin = new Login();
        Admin admin = new Admin();
        admin.setFirstName("admin");
        admin.setLastName("_admin");
        admin.setGender(Gender.MAN);

        UserNamePassword userNamePassword = new UserNamePassword();
        userNamePassword.setUserName("admin");
        userNamePassword.setPassword("adminadmin");
        adminLogin.setUser(admin);
        adminLogin.setUserNamePassword(userNamePassword);
        return adminLogin;
    }
}
