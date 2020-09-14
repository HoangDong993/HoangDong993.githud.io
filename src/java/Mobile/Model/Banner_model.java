/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mobile.Model;

import Mobile.Untity.Banner;
import Mobile.Untity.Category;
import Mobile.Untity.Color;
import Mobile.lty.NewHibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author asus
 */
public class Banner_model {
    
    
    
   public Banner geBannertBytID(int banId){
       Session ses = null;
       Transaction tran = null;
       Query query = null;
       Banner ban = null;
       try {
           ses = NewHibernateUtil.getSessionFactory().openSession();
           tran =ses.getTransaction();
           tran.begin();
           query = ses.createQuery("from Banner where bannerId=:bannerId");
           query.setInteger("bannerId", banId);
           ban =(Banner)query.uniqueResult();
           ses.getTransaction().commit();
           
           ses.close();
       } catch (Exception e) {
           
           e.printStackTrace();
           tran.rollback();
       }
       
       return  ban;
   
   }
   
   
   
    
    
    
    
     public boolean insertBanner(Banner ban){
       Session ses = null;
       Transaction tran = null;
       
       try {
           ses = NewHibernateUtil.getSessionFactory().openSession();
           tran = ses.getTransaction();
           tran.begin();
           
           ses.save(ban);
           ses.getTransaction().commit();
           
           ses.close();
           
           return  true;
       } catch (Exception e) {
           
           e.printStackTrace();
       }
       return  false;
     }
}
