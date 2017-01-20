package com.naderaria.intelligentAssistant.view.util;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by naderaria on 1/5/17.
 */
public final class MenuItem  implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String name;
    private String title;
    private String cssClassName;
    private String roleName;
    private String iconName;
    private String dispatch;
    private String jsMethodName;
    private Map<String,String> otherProperty;
    private List<String> subItems;

    public MenuItem(){}

    public MenuItem( MenuItem menuItem ){

        this.id = menuItem.id;
        this.name = menuItem.name;
        this.title = menuItem.title;
        this.cssClassName = menuItem.cssClassName;
        this.roleName = menuItem.roleName;
        this.iconName = menuItem.iconName;
        this.dispatch = menuItem.dispatch;
        this.jsMethodName = menuItem.jsMethodName;
        this.otherProperty = menuItem.otherProperty;
        this.subItems = menuItem.subItems;
    }
    public MenuItem( String id , String dispatch ){
        this.id = id;
        this.name = id;
        this.title = id;
        this.dispatch = dispatch;
    }

    public MenuItem( String id , String cssClassName , String dispatch ){

        this( id , dispatch );
        this.cssClassName = cssClassName;

    }
    public MenuItem( String id , String name , String title , String cssClassName , String dispatch ){
        this.id = id;
        this.name = name;
        this.title = title;
        this.cssClassName = cssClassName;
        this.dispatch = dispatch;
    }

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

    public String getDispatch(){ return dispatch; }
    public void setDispatch( String dispatch ){ this.dispatch = dispatch; }

    public String getJSMEthodName(){ return jsMethodName; }
    public void setJsMethodName( String jsMethodName ){ this.jsMethodName = jsMethodName; }

    public Map<String,String> getOtherProperty(){ return otherProperty; }
    public void setOtherProperty( Map<String,String> otherProperty ){ this.otherProperty = otherProperty; }

    public List<String> getSubItems(){ return subItems; }
    public void setSubItems( List<String> subItems ){ this.subItems = subItems; }



}
