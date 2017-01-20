package com.naderaria.intelligentAssistant.dao.interfaces;

import java.util.List;
import java.util.Map;
import javax.ejb.Local;

import com.naderaria.intelligentAssistant.entities.abstracts.BaseEntity;

@Local
public interface ILocalGeneralDao<T extends BaseEntity> {

	public  T  add( T t ) throws Exception;
    public  List<T> add( List<T> ts ) throws Exception;
    public  T  update( T t ) throws Exception;
    public  List<T> update( List<T> ts ) throws Exception;
    public  void delete( T t ) throws Exception;
    public  void delete( List<T> ts ) throws Exception;
    public  void delete( Long id ) throws Exception;
    public  T selectById( Long id ) throws Exception;
    public  int fetchCount( String queryName ) throws Exception;
    public  T selectByQueryName( String queryName  ) throws Exception;
    public  T selectByQueryName( String queryName , Map<String,Object> params ) throws Exception;
    public  List<T> selectAllByQueryName( String queryName ) throws Exception;
    public  List<T> selectAllByQueryName( String queryName , Map<String,Object> params ) throws Exception;
    public  T selectByCriteriaQuery( String criteriaQuery ) throws Exception;
    public  T selectByCriteriaQuery( String criteriaQuery , Map<String,Object> params ) throws Exception;
}
