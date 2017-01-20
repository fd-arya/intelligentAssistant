package com.naderaria.intelligentAssistant.business.service.internal.interfaces;

import java.util.List;
import java.util.Map;
import javax.ejb.Local;
import com.naderaria.intelligentAssistant.entities.abstracts.BaseEntity;

@Local
public interface ILocalGeneralService<T extends BaseEntity> {
	
	public  T  save( T t ) throws Exception;
    public List<T> save( List<T> ts ) throws Exception;
    public  T  update( T t ) throws Exception;
    public  List<T> update( List<T> ts ) throws Exception;
    public  void delete( T t ) throws Exception;
    public  void delete( List<T> ts ) throws Exception;
    public  void delete( Long id ) throws Exception;
    public  T findById( Long id ) throws Exception;
    public  int fetchCount( String queryName ) throws Exception;
    public  T findByQueryName( String queryName  ) throws Exception;
    public  T findByQueryName( String queryName , Map<String,Object> params ) throws Exception;
    public  List<T> findAllByQueryName( String queryName ) throws Exception;
    public  List<T> findAllByQueryName( String queryName , Map<String,Object> params ) throws Exception;
    public  T findByCriteriaQuery( String criteriaQuery ) throws Exception;
    public  T findByCriteriaQuery( String criteriaQuery , Map<String,Object> params) throws Exception;
    
}
