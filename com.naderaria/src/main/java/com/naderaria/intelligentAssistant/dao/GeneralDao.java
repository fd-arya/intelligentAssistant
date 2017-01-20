package com.naderaria.intelligentAssistant.dao;

import java.util.List;
import java.util.Map;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import java.lang.reflect.Type;
import java.lang.reflect.ParameterizedType;
import com.naderaria.intelligentAssistant.dao.interfaces.ILocalGeneralDao;
import com.naderaria.intelligentAssistant.dao.interfaces.IRemoteGeneralDao;
import com.naderaria.intelligentAssistant.entities.abstracts.BaseEntity;


@Stateful
public class GeneralDao<T extends BaseEntity> implements ILocalGeneralDao<T>,IRemoteGeneralDao{


	@PersistenceContext( unitName = "intelligentAssistant" ,type = PersistenceContextType.EXTENDED )
    private EntityManager entityManager;

   
    public T add( T t ) throws Exception {

        entityManager.persist( t );
        entityManager.flush();
        entityManager.clear();
        return t;
    }

   
    public List<T> add( List<T> ts ) throws Exception {

        for( T t : ts ){
            entityManager.persist( t );
        }
        entityManager.flush();
        entityManager.clear();
        return ts;
    }

    
    public T update( T t ) throws Exception {

        entityManager.merge( t );
        entityManager.flush();
        entityManager.clear();
        return t;
    }

   
    public List<T> update( List<T> ts ) throws Exception {

        for( T t : ts ){
          update( t );
        }
        return ts;
    }

    
    public void delete( T t ) throws Exception {

        entityManager.remove( entityManager.getReference( t.getClass() , ( t.getId() )));
        entityManager.flush();
        entityManager.clear();

    }

   
    public void delete( List<T> ts ) throws Exception {

        for( T t :ts ){
            delete(t);
        }
    }

    
    public void delete( Long id ) throws Exception {

        entityManager.remove( entityManager.getReference( getClassT().getClass() , id ));
        entityManager.flush();
        entityManager.clear();
    }

    
    public T selectById( Long id ) throws Exception {

       return (T) entityManager.find( getClassT().getClass() , id );
    }

    
    public  int fetchCount( String queryName ) throws Exception{
        return entityManager.createNamedQuery( queryName ).getMaxResults();
    }
    
    public T selectByQueryName( String queryName ) throws Exception {

       return (T) entityManager.createNamedQuery( queryName ).getSingleResult();

    }

   
    public  T selectByQueryName( String queryName , Map<String,Object> params ) throws Exception{

        //TODO create query use params;
        return null;
    }

   
    public List<T> selectAllByQueryName( String queryName) throws Exception {

        return (List<T>) entityManager.createNamedQuery( queryName ).getResultList();
    }

   
    public  List<T> selectAllByQueryName( String queryName , Map<String,Object> params ) throws Exception{

        //TODO create query use params;
        return null;
    }

   
    public T selectByCriteriaQuery( String criteriaQuery ) throws Exception {

        //TODO create query use params;
        return null;
       //return (T) entityManager.createQuery(criteriaQuery,getClassT().getClass()).getSingleResult();
    }

    
    public  T selectByCriteriaQuery( String criteriaQuery , Map<String,Object> params ) throws Exception{

        //TODO create query use params;
        return null;
    }

    private T getClassT() throws Exception{

       Class<T> tClass = null;
       Type type = tClass.getGenericSuperclass();
       ParameterizedType parameterizedType = (ParameterizedType) type;
       tClass = ( Class<T>) parameterizedType.getActualTypeArguments()[0];
       return  tClass.newInstance();
    }
}


