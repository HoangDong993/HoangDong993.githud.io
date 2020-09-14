/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mobile.Model;

import Mobile.Untity.Category;
import Mobile.Untity.ProductDetail;
import Mobile.lty.NewHibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author asus
 */
public class ProductDetail_model {
    
    public List<ProductDetail> getall(){
    
        Session ses = NewHibernateUtil.getSessionFactory().openSession();
        ses.getTransaction().begin();
        
        Query query = ses.createQuery("from Category");
        List<ProductDetail> listProd = query.list();
        ses.getTransaction().commit();
        
        ses.close();
        
        return listProd;
    }
    
   public ProductDetail getByProdID(int prodID){
       Session ses = null;
       Transaction tran = null;
       Query query = null;
       ProductDetail prod = null;
       try {
           ses = NewHibernateUtil.getSessionFactory().openSession();
           tran =ses.getTransaction();
           tran.begin();
           query = ses.createQuery("from ProductDetail where productDetailId=:prodID");
           query.setInteger("prodID", prodID);
           prod =(ProductDetail)query.uniqueResult();
           ses.getTransaction().commit();
           
           ses.close();
       } catch (Exception e) {
           
           e.printStackTrace();
           tran.rollback();
       }
       
       return  prod;
   
   }
   
   public List<ProductDetail> getByProId(String proId){
       Session ses = null;
       Transaction tran = null;
       Query query = null;
       List<ProductDetail> listProd = null;
       try {
           ses = NewHibernateUtil.getSessionFactory().openSession();
           tran = ses.getTransaction();
           tran.begin();
           query = ses.createQuery("from ProductDetail where product=:proId");
           query.setString("proId", proId);
           listProd = query.list();
           ses.getTransaction().commit();
           
           ses.close();
       } catch (Exception e) {
           
           e.printStackTrace();
       }
       
       return  listProd;
   
   }
   
    public boolean deleteProdById(int prodId){
       Session ses = null;
       Transaction tran = null;
       ProductDetail prod = null;
       try {
           ses = NewHibernateUtil.getSessionFactory().openSession();
           tran = ses.getTransaction();
           tran.begin();
           prod = getByProdID(prodId);
           ses.delete(prod);
           ses.getTransaction().commit();
           
           ses.close();
           
           return  true;
       } catch (Exception e) {
           
           e.printStackTrace();
       }
       return  false;
   
    }
    
    public boolean updatProdeById(ProductDetail prod){
       Session ses = null;
       Transaction tran = null;
      
       try {
           ses = NewHibernateUtil.getSessionFactory().openSession();
           tran = ses.getTransaction();
           tran.begin();
           ses.merge(prod);
           ses.getTransaction().commit();
           
           ses.close();
           
           return  true;
       } catch (Exception e) {
           
           e.printStackTrace();
       }
       return  false;
   
    }
    
     public boolean insertProd(ProductDetail prod){
       Session ses = null;
       Transaction tran = null;
       
       try {
           ses = NewHibernateUtil.getSessionFactory().openSession();
           tran = ses.getTransaction();
           tran.begin();
           
           ses.save(prod);
           ses.getTransaction().commit();
           
           ses.close();
           
           return  true;
       } catch (Exception e) {
           
           e.printStackTrace();
       }
       return  false;
     }
}
