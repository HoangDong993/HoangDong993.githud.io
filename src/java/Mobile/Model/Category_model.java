/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mobile.Model;

import Mobile.Untity.Category;
import Mobile.lty.NewHibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author asus
 */
public class Category_model {
    
    public List<Category> getall(){
    
        Session ses = NewHibernateUtil.getSessionFactory().openSession();
        ses.getTransaction().begin();
        
        Query query = ses.createQuery("from Category");
        List<Category> listCat = query.list();
        ses.getTransaction().commit();
        
        ses.close();
        
        return listCat;
    }
    
   public Category getByCatID(int catID){
       Session ses = null;
       Transaction tran = null;
       Query query = null;
       Category cat = null;
       try {
           ses = NewHibernateUtil.getSessionFactory().openSession();
           tran =ses.getTransaction();
           tran.begin();
           query = ses.createQuery("from Category where categoryId=:catID");
           query.setInteger("catID", catID);
           cat =(Category)query.uniqueResult();
           ses.getTransaction().commit();
           
           ses.close();
       } catch (Exception e) {
           
           e.printStackTrace();
           tran.rollback();
       }
       
       return  cat;
   
   }
   
   public List<Category> getByCatName(String catName){
       Session ses = null;
       Transaction tran = null;
       Query query = null;
       List<Category> listCat = null;
       try {
           ses = NewHibernateUtil.getSessionFactory().openSession();
           tran = ses.getTransaction();
           tran.begin();
           query = ses.createQuery("from Category where categoryName=:catName");
           query.setString("catName", catName);
           listCat = query.list();
           ses.getTransaction().commit();
           
           ses.close();
       } catch (Exception e) {
           
           e.printStackTrace();
       }
       
       return  listCat;
   
   }
   
    public boolean deleteCatByCatId(int catId){
       Session ses = null;
       Transaction tran = null;
       Category cat = null;
       try {
           ses = NewHibernateUtil.getSessionFactory().openSession();
           tran = ses.getTransaction();
           tran.begin();
           cat = getByCatID(catId);
           ses.delete(cat);
           ses.getTransaction().commit();
           
           ses.close();
           
           return  true;
       } catch (Exception e) {
           
           e.printStackTrace();
       }
       return  false;
   
    }
    
    public boolean updateCatByCatId(Category cat){
       Session ses = null;
       Transaction tran = null;
      
       try {
           ses = NewHibernateUtil.getSessionFactory().openSession();
           tran = ses.getTransaction();
           tran.begin();
           ses.merge(cat);
           ses.getTransaction().commit();
           
           ses.close();
           
           return  true;
       } catch (Exception e) {
           
           e.printStackTrace();
       }
       return  false;
   
    }
    
     public boolean insertCat(Category cat){
       Session ses = null;
       Transaction tran = null;
       
       try {
           ses = NewHibernateUtil.getSessionFactory().openSession();
           tran = ses.getTransaction();
           tran.begin();
           
           ses.save(cat);
           ses.getTransaction().commit();
           
           ses.close();
           
           return  true;
       } catch (Exception e) {
           
           e.printStackTrace();
       }
       return  false;
     }
}
