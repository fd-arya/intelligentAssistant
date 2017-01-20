package com.naderaria.intelligentAssistant.entities.interfaces;

import java.util.ArrayList;
import java.util.List;

public interface IAccountModuleMarker extends IFetchMenu {

    @Override
    public default String getMainMenu(){
        return IDefaultVariable.ACCOUNT_MAIN_MENU;
    }

    @Override
    public default List<String> getSubMenu(){

        List<String> subMenu = new ArrayList<>();
        subMenu.add(IDefaultVariable.ACCOUNT_CREATE_USER);
        subMenu.add(IDefaultVariable.ACCOUNT_READ_USER);
        subMenu.add(IDefaultVariable.ACCOUNT_UPDATE_USER);
        subMenu.add(IDefaultVariable.ACCOUNT_DELETE_USER);
        subMenu.add(IDefaultVariable.ACCOUNT_SET_ACCESS_LEVEL_USER);
        return subMenu;
    }




}
