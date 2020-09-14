/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mobile.Model;

import Mobile.Untity.Category;
import Mobile.Untity.Product;
import Mobile.lty.NewHibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author asus
 */
public class Product_model {
    
    public List<Product> getall(){
    
        Session ses = NewHibernateUtil.getSessionFactory().openSession();
        ses.getTransaction().begin();
        
        Query query = ses.createQuery("from Product");
        List<Product> listPro = query.list();
        ses.getTransaction().commit();
        
        ses.close();
        
        return listPro;
    }
    
   public Product getByProID(int proID){
       Session ses = null;
       Transaction tran = null;
       Query query = null;
       Product pro = null;
       try {
           ses = NewHibernateUtil.getSessionFactory().openSession();
           tran =ses.getTransaction();
           tran.begin();
           query = ses.createQuery("from Product where productId=:proID");
           query.setInteger("proID", proID);
           pro =(Product)query.uniqueResult();
           ses.getTransaction().commit();
           
           ses.close();
       } catch (Exception e) {
           
           e.printStackTrace();
           tran.rollback();
       }
       
       return  pro;
   
   }
   
   public List<Product> getByproName(String proName){
       Session ses = null;
       Transaction tran = null;
       Query query = null;
       List<Product> listPro = null;
       try {
           ses = NewHibernateUtil.getSessionFactory().openSession();
           tran = ses.getTransaction();
           tran.begin();
           query = ses.createQuery("from Product where productName=:proName");
           query.setString("proName", proName);
           listPro = query.list();
           ses.getTransaction().commit();
           
           ses.close();
       } catch (Exception e) {
           
           e.printStackTrace();
       }
       
       return  listPro;
   
   }
   
   public List<Product> getByCatId(int cate){
       Session ses = null;
       Transaction tran = null;
       Query query = null;
       List<Product> listPro = null;
       try {
           ses = NewHibernateUtil.getSessionFactory().openSession();
           tran = ses.getTransaction();
           tran.begin();
           query = ses.createQuery("from Product where category=:category");
           query.setInteger("category", cate);
           listPro = query.list();
           ses.getTransaction().commit();
           
           ses.close();
       } catch (Exception e) {
           
           e.printStackTrace();
       }
       
       return  listPro;
   
   }
   
   
   
    public boolean deleteproById(int proId){
       Session ses = null;
       Transaction tran = null;
       Product pro = null;
       try {
           ses = NewHibernateUtil.getSessionFactory().openSession();
           tran = ses.getTransaction();
           tran.begin();
           pro = getByProID(proId);
           ses.delete(pro);
           ses.getTransaction().commit();
           
           ses.close();
           
           return  true;
       } catch (Exception e) {
           
           e.printStackTrace();
       }
       return  false;
   
    }
    
    public boolean updateProById(Product pro){
       Session ses = null;
       Transaction tran = null;
      
       try {
           ses = NewHibernateUtil.getSessionFactory().openSession();
           tran = ses.getTransaction();
           tran.begin();
           ses.merge(pro);
           ses.getTransaction().commit();
           
           ses.close();
           
           return  true;
       } catch (Exception e) {
           
           e.printStackTrace();
       }
       return  false;
   
    }
    
     public boolean insertPro(Product pro){
       Session ses = null;
       Transaction tran = null;
       
       try {
           ses = NewHibernateUtil.getSessionFactory().openSession();
           tran = ses.getTransaction();
           tran.begin();
           
           ses.save(pro);
           ses.getTransaction().commit();
           
           ses.close();
           
           return  true;
       } catch (Exception e) {
           
           e.printStackTrace();
       }
       return  false;
     }
}
