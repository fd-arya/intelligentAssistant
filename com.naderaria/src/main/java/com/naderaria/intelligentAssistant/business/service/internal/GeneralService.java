package com.naderaria.intelligentAssistant.business.service.internal;

import java.util.List;
import java.util.Map;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.naderaria.intelligentAssistant.business.service.internal.interfaces.ILocalGeneralService;
import com.naderaria.intelligentAssistant.dao.interfaces.ILocalGeneralDao;
import com.naderaria.intelligentAssistant.entities.abstracts.BaseEntity;

@Stateless
public class GeneralService<T extends BaseEntity> implements ILocalGeneralService<T> {

	@EJB
    private ILocalGeneralDao<T> generalDao;

   
    public T save( T t ) throws Exception {
        return generalDao.add( t );
    }

   
    public List<T> save( List<T> ts ) throws Exception {
        return generalDao.add( ts );
    }

   
    public T update( T t ) throws Exception {
        return  generalDao.update( t );
    }

    
    public List<T> update( List<T> ts ) throws Exception {
        return generalDao.update( ts );
    }

    
    public void delete( T t ) throws Exception {
        generalDao.delete( t );
    }

   
    public void delete( List<T> ts ) throws Exception {
        generalDao.delete( ts );
    }

    
    public void delete( Long id ) throws Exception {
        generalDao.delete( id );
    }

    
    public T findById( Long id ) throws Exception {
        return generalDao.selectById( id );
    }

   
    public int fetchCount( String queryName ) throws Exception{
        return generalDao.fetchCount( queryName );
    }
   
    
    public T findByQueryName( String queryName ) throws Exception {
        return generalDao.selectByQueryName( queryName );
    }

   
    public  T findByQueryName( String queryName , Map<String,Object> params ) throws Exception{
        return generalDao.selectByQueryName( queryName , params );
    }

   
    public List<T> findAllByQueryName( String queryName ) throws Exception {
        return generalDao.selectAllByQueryName( queryName );
    }

   
    public  List<T> findAllByQueryName( String queryName , Map<String,Object> params ) throws Exception{
        return generalDao.selectAllByQueryName( queryName , params );
    }

   
    public T findByCriteriaQuery( String criteriaQuery ) throws Exception {
        return  generalDao.selectByCriteriaQuery( criteriaQuery );
    }

    
    public  T findByCriteriaQuery( String criteriaQuery , Map<String,Object> params ) throws Exception{
        return generalDao.selectByCriteriaQuery( criteriaQuery , params );
    }
}
