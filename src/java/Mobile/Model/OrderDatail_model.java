/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mobile.Model;

import Mobile.Untity.Category;
import Mobile.Untity.OrderDetail;
import Mobile.lty.NewHibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author asus
 */
public class OrderDatail_model {
    
    public List<OrderDetail> getall(){
    
        Session ses = NewHibernateUtil.getSessionFactory().openSession();
        ses.getTransaction().begin();
        
        Query query = ses.createQuery("from OrderDetail");
        List<OrderDetail> listOrDetail = query.list();
        ses.getTransaction().commit();
        
        ses.close();
        
        return listOrDetail;
    }
    
   public OrderDetail getByOrdetailID(int ordetailID){
       Session ses = null;
       Transaction tran = null;
       Query query = null;
       OrderDetail ordetail = null;
       try {
           ses = NewHibernateUtil.getSessionFactory().openSession();
           tran =ses.getTransaction();
           tran.begin();
           query = ses.createQuery("from OrderDetail where orderDetailId=:ordetailID");
           query.setInteger("ordetailID", ordetailID);
           ordetail =(OrderDetail)query.uniqueResult();
           ses.getTransaction().commit();
           
           ses.close();
       } catch (Exception e) {
           
           e.printStackTrace();
           tran.rollback();
       }
       
       return  ordetail;
   
   }
   
   public List<OrderDetail> getOrdetailByOrderId(int orderId){
       Session ses = null;
       Transaction tran = null;
       Query query = null;
       List<OrderDetail> listOrdetail = null;
       try {
           ses = NewHibernateUtil.getSessionFactory().openSession();
           tran = ses.getTransaction();
           tran.begin();
           query = ses.createQuery("from OrderDetail where orderPro=:orderId");
           query.setInteger("orderId", orderId);
           listOrdetail = query.list();
           ses.getTransaction().commit();
           
           ses.close();
       } catch (Exception e) {
           
           e.printStackTrace();
       }
       
       return  listOrdetail;
   
   }
   
    public boolean deleteOrdetailByOrderId(int orderId){
       Session ses = null;
       Transaction tran = null;
       List <OrderDetail> ordetail = null;
       try {
           ses = NewHibernateUtil.getSessionFactory().openSession();
           tran = ses.getTransaction();
           tran.begin();
           ordetail = getOrdetailByOrderId(orderId);
           ses.delete(ordetail);
           ses.getTransaction().commit();
           
           ses.close();
           
           return  true;
       } catch (Exception e) {
           
           e.printStackTrace();
       }
       return  false;
   
    }
    
    
    
     public boolean insertOedetail(OrderDetail ordetail){
       Session ses = null;
       Transaction tran = null;
       
       try {
           ses = NewHibernateUtil.getSessionFactory().openSession();
           tran = ses.getTransaction();
           tran.begin();
           
           ses.save(ordetail);
           ses.getTransaction().commit();
           
           ses.close();
           
           return  true;
       } catch (Exception e) {
           
           e.printStackTrace();
       }
       return  false;
     }
}
