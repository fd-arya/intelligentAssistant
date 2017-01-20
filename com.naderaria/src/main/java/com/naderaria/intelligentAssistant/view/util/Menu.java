package com.naderaria.intelligentAssistant.view.util;

import java.io.Serializable;
import java.util.List;

/**
 * Created by naderaria on 1/5/17.
 */
public final class Menu implements Serializable {

    private static final long serialVersionUID = 1L;
    private String id;
    private String name;
    private String title;
    private String cssClassName;
    private String roleName;
    private String iconName;
    private String jsMethodName;
    private List<MenuItem> menuItems;

    public String getId(){ return id; }
    public void setId( String id ){ this.id = id; }

    public String getName(){ return name; }
    public void setName( String name ){ this.name = name; }

    public String getTitle(){ return title; }
    public void setTitle( String title ){ this.title = title; }

    public String getCssClassName(){ return cssClassName; }
    public void setCssClassName( String cssClassName ){ this.cssClassName = cssClassName; }

    public String getRoleName(){ return roleName; }
    public void setRoleName( String roleName ){ this.roleName = roleName; }

    public String getIconName(){ return iconName; }
    public void setIconName( String iconName ){ this.iconName = iconName; }

    public String getJsMethodName(){ return jsMethodName; }
    public void setJsMethodName( String jsMethodName ){ this.jsMethodName = jsMethodName; }

    public List<MenuItem> getMenuItems(){ return menuItems; }
    public void setMenuItems( List<MenuItem> menuItems ){ this.menuItems = menuItems; }

}
